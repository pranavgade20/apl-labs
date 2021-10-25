package week8._5;

import java.io.IOException;
import java.net.*;

public class Main {
    //Write a java program to demonstrate the use of following methods in java DatagramSocket Class:
    //1) getLocalSocketAddress()
    //2) getPort()
    //3) isClosed()
    //4) isConnected()
    //5) send()
    //6) getReceiveBufferSize()
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        socket.connect(InetAddress.getByName("ping.online.net"), 5206);

        System.out.println("socket.getLocalSocketAddress() returns: " + socket.getLocalSocketAddress());
        System.out.println("socket.getPort() returns: " + socket.getPort());
        System.out.println("socket.isClosed() returns: " + socket.isClosed());
        System.out.println("socket.isConnected() returns: " + socket.isConnected());
        System.out.println("sending 'hello'...");
        socket.send(new DatagramPacket("hello".getBytes(), 5));
        System.out.println("socket.getReceiveBufferSize() returns: " + socket.getReceiveBufferSize());
    }
}
