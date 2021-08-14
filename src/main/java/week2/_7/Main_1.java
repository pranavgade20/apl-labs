package week2._7;

public class Main_1 {
    static int multiply(int x, int y) {
        return x * y;
    }
    static int multiply(int x, int y, int z) {
        return x * y * z;
    }
    static int multiply(double x, double y) {
        return (int) (x * y);
    }
    public static void main(String[] args) {
        System.out.println("Multiplying 2 and 3: " + multiply(2, 3));
        System.out.println("Multiplying 2, 3, and 4: " + multiply(2, 3, 4));
        System.out.println("Multiplying 2 and 3.5: " + multiply(2, 3.5));
    }
}
