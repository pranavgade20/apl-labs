package week4._4;

import java.util.Arrays;

public class Divider {
    public static int[] divide(int[] arr, int num) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]/num;
        }
        System.out.println("Divided elements: " + Arrays.toString(arr));
        return arr;
    }
}
