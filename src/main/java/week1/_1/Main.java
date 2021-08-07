package week1._1;

public class Main {
    static int add(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mult(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        return a / b;
    }
    static int mod(int a, int b) {
        return a % b;
    }

    static boolean and(boolean a, boolean b) {
        return a && b;
    }
    static boolean or(boolean a, boolean b) {
        return a || b;
    }
    static boolean not(boolean a) {
        return !a;
    }
    
    public static void main(String[] args) {
        int a = 13, b = 4;
        System.out.println(a + " + " + b + " = " + add(a, b));
        System.out.println(a + " - " + b + " = " + sub(a, b));
        System.out.println(a + " * " + b + " = " + mult(a, b));
        System.out.println(a + " / " + b + " = " + div(a, b));
        System.out.println(a + " % " + b + " = " + mod(a, b));
        
        boolean x = false, y = true;
        System.out.println(x + " and " + y + " = " + and(x, y));
        System.out.println(x + " or " + y + " = " + or(x, y));
        System.out.println("not " + x + " = " + not(x));
    }
}
