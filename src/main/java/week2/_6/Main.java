package week2._6;

public class Main {
    // Write a Java method to display the first 50 pentagonal numbers such as (1, 5, 12, 22, 35,
    // 51, ………).
    public static void main(String[] args) {
        int x = 1;
        int increase = 4;

        for (int i = 0; i < 50; i++) {
            System.out.println(x);
            x += increase;
            increase += 3;
        }
    }
}
