package week2._5;

import java.util.Scanner;

public class Main {
    // Write a Java program to calculate the area of circle, pentagon, triangle, square and
    // rectangle using switch statement. Remember at any time users/programmer can see the
    // area of any one of the geometrical shape.
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Enter type of shape: ");
        String shape = sc.nextLine();
        System.out.println(shape);

        double area = 0;
        switch (shape.toLowerCase()) {
            case "circle":
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println(radius);
                area = Math.PI * radius * radius;
                break;
            case "pentagon":
                System.out.print("Enter side length: ");
                double length = sc.nextDouble();
                System.out.println(length);
                area = 1.72048 * length * length;
                break;
            case "triangle":
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.println(base);
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                System.out.println(height);
                area = 0.5 * base * height;
                break;
            case "square":
                System.out.print("Enter side length: ");
                length = sc.nextDouble();
                System.out.println(length);
                area = length * length;
                break;
            case "rectangle":
                System.out.print("Enter length: ");
                length = sc.nextDouble();
                System.out.println(length);
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                System.out.println(width);
                area = length * width;
        }
        System.out.println("Area is: " + area);
    }
}
