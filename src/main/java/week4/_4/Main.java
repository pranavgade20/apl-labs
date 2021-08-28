package week4._4;

import java.util.Arrays;

/*
4. Write two classes, where first-class contains a sort method that sort the 10 numerical numbers and
printed sorted sequence of the numbers and the second class contains a division method that consists of an
array of 15 numbers, and each number is divided by a numerical number such as arr[]= {10, 20, 30} and
the numerical number is 2, so the output of this array is {5, 10, 15}. To define the possible error handling
mechanism for the above two classes and check how your code handled the exceptions.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Sorting without duplicate elements");
            Sorter.sort(new int[]{10, 13, 12, 9, 11, 1, 2, 3, 4, 5});
            System.out.println("Sorting with duplicate elements");
            Sorter.sort(new int[]{9, 13, 12, 9, 11, 1, 2, 3, 4, 5});
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
        try {
            System.out.println("Dividing by 2");
            Divider.divide(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150}, 2);
            System.out.println("Dividing by 0");
            Divider.divide(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150}, 0);
        } catch (Exception e) {
            System.out.println(e);
            Arrays.stream(e.getStackTrace()).forEachOrdered(m -> System.out.println("\t" + m));
        }
    }
}
