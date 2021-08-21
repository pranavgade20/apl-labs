package week3._4;

import java.util.Scanner;

/*
4. Write a recursive definition in java that converts binary number to decimal number.
 */
public class Main {
    static int bin_to_dec(String bin) {
        if (bin.length() == 1) return bin.charAt(0) - '0';
        return 2*bin_to_dec(bin.substring(0, bin.length()-1)) + (bin.charAt(bin.length()-1) - '0');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String bin = sc.next();
        System.out.println(bin);
        System.out.println("Decimal representation is: " + bin_to_dec(bin));
    }
}
