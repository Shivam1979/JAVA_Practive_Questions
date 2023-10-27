package Arrays;

import java.util.Arrays;

/**
 * 286. *Write a code for bubble sort* 🧼
 * *Input Case:*
 * Array: [64, 34, 25, 12, 22, 11, 90]
 * *Output Case:*
 * Sorted Array: [11, 12, 22, 25, 34, 64, 90]
 */
public class Bubble11 {
    static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // swap arr[j] and arr[j+1]
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;

                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted Array : ");
        System.out.println(Arrays.toString(arr));
        int n = arr.length - 1;
        bubbleSort(arr, n);
        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(arr));
    }

}
