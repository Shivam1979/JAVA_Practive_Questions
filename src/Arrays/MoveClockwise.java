package Arrays;

import javax.crypto.spec.PSource;

public class MoveClockwise {
 /*  Input: arr[] = {1, 2, 3, 4, 5}
   Output: arr[] = {5, 1, 2, 3, 4}

   Input: arr[] = {2, 3, 4, 5, 1}
   Output: {1, 2, 3, 4, 5}*/


    static void clock(int arr[], int n) {
        int s = arr[n];
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = s;
    }
    static void read(int arr[]) {
        for (int read : arr) {System.out.print(read + " ");}}
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length - 1;
        System.out.print("Input : ");
        read(arr);
        clock(arr, n);
        System.out.print("Output : ");
        read(arr);

    }
}
