package week8._4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    //Write a java program to demonstrate the use of following methods in Java HttpURLConnection class:
    //1) httpURLConnection ()
    //2) getFollowRedirects()
    //3) getHeaderFieldDate()
    //4) getRequestMethod()
    //5) setFixedLengthStreamingMode()
    //6) usingProxy()
    public static void main(String[] args) throws IOException {
        System.out.println("creating a HttpURLConnection");
        HttpURLConnection connection = (HttpURLConnection) new URL("http://pranavg.me").openConnection();

        System.out.println("setting FixedLengthStreamingMode");
        connection.setFixedLengthStreamingMode(664 + 2168);
        connection.connect();
        System.out.println("connection.getInstanceFollowRedirects() returns " + connection.getInstanceFollowRedirects());
        System.out.println("connection.getHeaderFieldDate() returns " + connection.getHeaderFieldDate("expires", 0));
        System.out.println("connection.getRequestMethod() returns " + connection.getRequestMethod());
        System.out.println("connection.usingProxy() returns " + connection.usingProxy());
    }
}
