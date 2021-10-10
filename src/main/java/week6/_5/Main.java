package week6._5;

import week6._5.a.A;
import week6._5.b.B;
import week6._5.c.C;

public class Main {
    //Create a Java program that implements three thread classes in different packages. In the main
    //methods create instances of it and put it in a ThreadGroup. Demonstrate any 7 methods
    //available in Java Thread Group Class.
    public static void main(String[] args) {
        var tg = new ThreadGroup("group");
        var a = new A(tg, () -> System.out.println("thread A"));
        var b = new B(tg, () -> System.out.println("thread B"));
        var c = new C(tg, () -> System.out.println("thread C"));
        System.out.println("calling list():");
        tg.list();
        System.out.println("calling isDaemon(): " + tg.isDaemon());
        System.out.println("calling activeCount(): " + tg.activeCount());
        System.out.println("calling activeGroupCount(): " + tg.activeGroupCount());
        System.out.println("calling getName(): " + tg.getName());
        System.out.println("calling suspend()");
        tg.suspend();
        System.out.println("calling resume()");
        tg.resume();
    }
}
