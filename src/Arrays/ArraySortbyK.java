package Arrays;

import java.util.Arrays;

public class ArraySortbyK {

    static void sortByMid(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                //swap
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }

        for (int i = arr.length / 2; i < arr.length; i++) {
            for (int j = arr.length / 2; j < arr.length - 1; j++) {
                //swap
                if (arr[j] < arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        /**232. Sort the first half in ascending order and the second half in descending:
         *    Input: arr[] = {5, 2, 4, 7, 9, 3, 1, 6, 8}
         *    Output: arr[] = {1, 2, 3, 4, 9, 8, 7, 6, 5}
         *    Input: arr[] = {1, 2, 3, 4, 5, 6}
         *    Output: arr[] = {1, 2, 3, 6, 5, 4}
         */

        int arr[] = {5, 2, 4, 7, 9, 3, 1, 6, 8};
        sortByMid(arr);
        System.out.println(Arrays.toString(arr));


    }
}
