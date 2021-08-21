package week3._1;

import java.util.Scanner;

public class Student {
    public static final Scanner sc = new Scanner(System.in);
    private String name, phone, roll_no;

    void getData() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.println(name);
        System.out.print("Enter roll no.: ");
        roll_no = sc.nextLine();
        System.out.println(roll_no);
        System.out.print("Enter phone no.: ");
        phone = sc.nextLine();
        System.out.println(phone);
    }

    void printData() {
        System.out.println("Name is: " + name);
        System.out.println("Roll no. is: " + roll_no);
        System.out.println("Telephone no. is: " + phone);
    }
}
