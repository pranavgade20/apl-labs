package week8._2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    //Create two Java files Client and Server. Client implements client program and Server implements
    //server program. Open two command prompt and run client program on one server client program on
    //other. In short, implement client-application.
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket client = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream());

        String str;
        out.write(str = in.readLine()); // echo a line
        System.out.println("Received string from client: " + str);

        out.close();
        in.close();
        client.close();
        serverSocket.close();
    }
}
