package week2._8;

public class Main {
    // Write a Java program to print the Fibonacci series of the number up to 100
    public static void main(String[] args) {
        int a = 1, b = 1;
        while (a < 100) {
            System.out.println(a);
            b += a;
            a = b-a;
        }
    }
}
