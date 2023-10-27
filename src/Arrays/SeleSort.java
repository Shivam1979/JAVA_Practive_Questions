package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 297. Selection Sort Algorithm
 * Test Case:
 * I/P: [64, 25, 12, 22, 11 ]
 * O/P: [11, 12, 22, 25, 64]
 */
public class SeleSort {
    static  void selectSort(int arr [] , int n){
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n+1; j++) {
                if (arr[i] > arr[j]){
                    // swap
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] =  swap;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr [] = {6,25,64, 25, 12, 22, 11,0,1,56};
        selectSort(arr,arr.length-1);


    }
}
