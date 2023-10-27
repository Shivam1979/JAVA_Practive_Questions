package Arrays;

import java.util.Arrays;

/**
 * 🔄 Input: Unsorted array [64, 34, 25, 12, 22, 11, 90]
 * 🏁 Output: Array sorted using the bubble sort algorithm (e.g.,
 * [11, 12, 22, 25, 34, 64, 90])
 */
public class BuubleSorting {

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    //swap
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

