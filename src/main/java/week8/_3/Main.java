package week8._3;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    //Write a java program to demonstrate the use of following methods in Java URL class.
    //1) getProtocol()
    //2) getHost()
    //3) getPort()
    //4) getAuthority()
    //5) toURL()
    //6) getQuery()
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        URL url = new URL("https://pranavg.me:443/blog?a=b");

        System.out.println("url.getProtocol() returns: " + url.getProtocol());
        System.out.println("url.getHost() returns: " + url.getHost());
        System.out.println("url.getPort() returns: " + url.getPort());
        System.out.println("url.getAuthority() returns: " + url.getAuthority());
        System.out.println("url.toURI() returns: " + url.toURI());
        System.out.println("url.getQuery() returns: " + url.getQuery());
    }
}
