import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.JavaExec;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.file.FileCollection;

import javax.inject.Inject;
import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class ExecuteTask extends DefaultTask {
    FileCollection runtimeClasspath;
    FileCollection classes;
    String classRegex;

    /**
     * Executes main() from all classes that match classRegex in classes
     * @param runtimeClasspath the runtime classpath, used internally to find the classes
     * @param classes the target classes directory/path
     * @param classRegex regex to match classes to be executed
     */
    @Inject
    public ExecuteTask(FileCollection runtimeClasspath, FileCollection classes, String classRegex) {
        this.runtimeClasspath = runtimeClasspath;
        this.classes = classes;
        this.classRegex = classRegex;
    }

    @TaskAction
    public void run() throws IOException {
        for (File path : classes.getFiles()) {
            URLClassLoader loader = new URLClassLoader(new URL[]{path.toPath().toUri().toURL()});
            Files.walk(path.toPath())
                .filter(classPath -> (path.toPath().relativize(classPath)).toString().matches(classRegex))
                .forEachOrdered(classPath -> {
                    try {
                        String relativePath = path.toPath().relativize(classPath).toString();
                        System.out.println("---Executing " + relativePath.replaceAll(".class$", ""));
                        var sout = System.out;
                        var sin = System.in;
                        var bos = new ByteArrayOutputStream();
                        System.setOut(new PrintStream(bos));
                        PipedOutputStream os = new PipedOutputStream();
                        PipedInputStream is = new PipedInputStream(1024*16);
                        try {
                            is.connect(os);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.setIn(is);
                        var fileReaderThread = new Thread(() -> {
                            try {
                                var fileReader = new BufferedReader(new FileReader(new File(System.getProperty("root.dir"), "in/" + relativePath.replaceAll(".class$", ""))));
                                String line;
                                while ((line = fileReader.readLine()) != null) {
                                     os.write((line+"\r\n").getBytes(StandardCharsets.UTF_8));
                                     os.flush();
                                }
                            } catch (Throwable ignored) { }
                        });
                        fileReaderThread.start();
                        Class<?> klass = loader.loadClass(relativePath.replaceAll(".class$", "").replaceAll("/", "."));
                        klass.getDeclaredMethod("main", String[].class).invoke(null, (Object) (new String[]{}));
                        System.setOut(sout);
                        System.setIn(sin);
                        bos.flush();
                        bos.writeTo(sout);
                        var outFile = new File(System.getProperty("root.dir"), "out/" + relativePath.replaceAll(".class$", ""));
                        outFile.getParentFile().mkdirs();
                        outFile.createNewFile();
                        var fos = new FileOutputStream(outFile);
                        bos.writeTo(fos);
                        bos.flush();
                        fos.flush();
                        fos.close();
                        bos.close();
                        fileReaderThread.interrupt();
                        System.out.println("---Finished executing " + relativePath.replaceAll(".class$", ""));
                    } catch (Throwable e) {
                        e.printStackTrace();
                    }
                });
        }
    }
}
