package week4._4;

import java.util.Arrays;

public class Sorter {
    public static int[] sort(int[] arr) throws Exception {
        // bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] == arr[j+1]) throw new Exception("Array elements must be different");
                else if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        System.out.println("Sorted elements: " + Arrays.toString(arr));
        return arr;
    }
}
