package week5._3;

import java.util.Arrays;

/*
Q3) Write a java program that demonstrates checked and unchecked exceptions. Implement two methods,
where first method throws 2 unchecked exceptions and second method throws 3 checked exceptions. Also
handle these exceptions using appropriate try-catch and finally block.
 */
public class Main {
    static boolean isPositive(int x) {
        if (x < 0) throw new RuntimeException("x is negative");
        else if (x == 0) throw new RuntimeException("x is 0");
        else return true;
    }

    static boolean verifyAge(int age) throws Exception {
        if (age < 0) throw new Exception("Age cannot be negative");
        else if (age < 18) throw new Exception("Age is below 18");
        else if (age > 100) throw new Exception("Age cannot be above 100");
        else return true;
    }

    public static void main(String[] args) {
        try {
            System.out.print("Is 2 positive: ");
            System.out.println(isPositive(2));
            System.out.print("Is -2 positive: ");
            System.out.println(isPositive(-2));
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
        try {
            System.out.print("Is 0 positive: ");
            System.out.println(isPositive(0));
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        } finally {
            System.out.println();
        }
        try {
            System.out.print("Is 33 valid age: ");
            System.out.println(verifyAge(33));
            System.out.print("Is 3 valid age: ");
            System.out.println(verifyAge(3));
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
        try {
            System.out.print("Is -3 valid age: ");
            System.out.println(verifyAge(-3));
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
        try {
            System.out.print("Is 333 valid age: ");
            System.out.println(verifyAge(333));
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
    }
}
