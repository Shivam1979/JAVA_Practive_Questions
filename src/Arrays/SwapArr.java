package Arrays;

import java.util.Scanner;

// Swap the array / reverse
public class SwapArr {
//
    public static void main(String[] args) {
        int [] arr = {3,9,5,6,4,8};
        // which index do you want to swap by which index
int  start = 0;
int end = arr.length-1;
        while (end>start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

          end--;
          start ++;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }



    }
}
