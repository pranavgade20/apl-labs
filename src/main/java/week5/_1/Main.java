package week5._1;

import java.util.Arrays;

/*
Q1) Write a package which contains a class called abstract class Citizen. Accept following details through
parameterized constructor
1) Name
2) Aadhar no
3) Phone number
4) Age
Citizen class also contains an abstract method called verifyAge() which checks if the person is above 18
years of age or not.
Create a Vaccine class which will use the Citizen package and extend it .It will implement verifyAge()
method .If the person is not eligible for vaccination then throw an exception .
 */
public class Main {
    public static void main(String[] args) {
        try {
            var x = new Vaccine("Pranav", "123412341234", "9876543210", 19);
            System.out.println("Verifying age of x: " + x.verifyAge());
            var y = new Vaccine("Ayush", "123456781234", "1234567890", 16);
            System.out.println("Verifying age of y: " + y.verifyAge());
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
    }
}
