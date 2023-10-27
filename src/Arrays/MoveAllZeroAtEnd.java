package Arrays;

import java.util.Arrays;

/**
 * 265.Move all zeros to the beginning/end of an array
 * Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
 * Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
 */
public class MoveAllZeroAtEnd {
    static void moveZere(int arr[]) {
        int bag[] = new int[arr.length];
        int n = arr.length - 1;
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                bag[n] = arr[i];
                n--;
            } else {
                bag[s] = arr[i];
                s++;
            }
        }
        System.out.println(Arrays.toString(bag));
    }
    public static void main(String[] args) {
        int arr[] = {0, 2, 0, 0, 0, 3, 6};
        moveZere(arr);

    }
}
