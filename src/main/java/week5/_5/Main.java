package week5._5;

import java.util.Arrays;

/*
Q5) Finally will always be executed whether exception is handled or not. Even if you return from the
method in the try block, finally block will still be executed. Write a java program which demonstrates this
concept. In finally block throw an exception, which is different from the exception thrown in the try
block. Handle these exceptions appropriately.
 */
public class Main {
    static boolean checkAge(int age) throws Exception {
        try {
            if (age > 18) return true;
            else throw new Exception("Age is below 18");
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
            if (age < 0) throw new Exception("Age is below 0");
        } finally {
            if (age > 100) throw new Exception("Age is above 100");
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Checking 1000: ");
            checkAge(1000);
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
        try {
            System.out.println("Checking -100:");
            checkAge(-100);
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
    }
}
