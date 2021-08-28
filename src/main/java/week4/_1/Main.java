package week4._1;

import week4._1.mca.Student;

/*
1. Write a Package MCA, which has one class Student. Accept student detail through the parameterized
constructor. Write display() method to display details. Create the main class that will use the package and
calculates total marks and percentages.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student(10, "Pranav", 100, 80);
        student.display();

        int total = student.marks1 + student.marks2;
        System.out.println("Total marks are " + total + " and percentage marks are " + total/2.0 + "%");
    }
}
