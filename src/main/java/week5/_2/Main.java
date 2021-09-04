package week5._2;

import week5._2.calculator.Minimum;
import week5._2.calculator.Sum;

import java.util.Arrays;
import java.util.List;

/*
Q2) Create a package that consists of two public classes. First class contains method which takes a list as
input and returns sum of them. Second class contains method which also takes a list as input and returns
minimum number from that array. Now create a main class and import this package and both these
classes. In this main class given a List of numbers find:
ans=sum(arr)/min(arr) ,where sum(arr) returns sum of arr
min(arr) returns min of arr.
Return ans.
Implement appropriate error handling mechanisms to handle any possible exception that you might
encounter.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Sum of 1, 2, 4, 5, 7: " + Sum.sum(List.of(1, 2, 4, 5, 7)));
            System.out.println("Sum of empty list: ");
            System.out.println(Sum.sum(List.of()));
        } catch (Exception e) {
            System.out.println("Exception while calculating sum: ");
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
        try {
            System.out.println("Minimum of 1, 2, 4, 5, 7: " + Minimum.min(List.of(1, 2, 4, 5, 7)));
            System.out.println("Minimum of empty list: ");
            System.out.println(Minimum.min(List.of()));
        } catch (Exception e) {
            System.out.println("Exception while calculating minimum: ");
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
    }
}
