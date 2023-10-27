package Arrays;

import java.util.Arrays;

/**
 * 263. How to rearrange positive and negative numbers in an array
 * Input: 1 -1 2 2 3 -3
 * Output:-1-2-3 1 3 2
 */
public class RearrangePositiveAndNegatiove {
    public static void main(String[] args) {//TC( -->O(n))
        int ar[] = {1, -1, 2, -2, 3, -3};
        int l = ar.length - 1;
        int s = 0;
        int arr [] = new int[ar.length];
        for (int i = 0; i < arr.length; i++) {
            if (ar[i] > 0) {
                arr[l] = ar[i];
                l--;
            } else {
                arr[s] = ar[i];
                s++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
