package Arrays;

import java.util.Arrays;

public class MissingNumber {
    /**
     * 256 . How do you find the missing number in a given integer array of 1 to 100?
     * int arr[] = {1, 2, 3, 5, 6, 7, 8};
     *Missing Number : 4
     * @param args
     */

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7, 8};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }
        System.out.println("Sum1  : " + sum1);
        int start = arr[0];
        int end = arr[arr.length - 1];
        for (int i = start; i <= end; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("Sum2  : " + sum2);
        System.out.println("Missing Number : " + (sum2 - sum1));

    }
}
