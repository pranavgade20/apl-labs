package week5._4;

import java.util.Arrays;

/*
Q4) Write a java program which contains 4 methods says first, second, third and fourth. Main method
will call first, first will second, second will third and third will call fourth. In fourth method throw an
ArithmeticException and propagate this exception up to the main method and handle it in main method.
 */
public class Main {
    public static void main(String[] args) {
        try {
            first();
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
    }
    static void first() {
        second();
    }
    static void second() {
        third();
    }
    static void third() {
        fourth();
    }
    static void fourth() {
        throw new ArithmeticException();
    }
}
