package Arrays;

import java.util.Arrays;

/**
 * 309. *How are duplicates removed from an array without using any library? (solution)*
 * 🎲 *Input:*
 * - Input array: [3, 4, 3, 6, 7, 4, 8]
 * 🎯 *Output:*
 * - Array without duplicates: [3, 4, 6, 7, 8]
 */
public class RemovDuplicate {
    public static void main(String[]args) {
        int arr[] = {3, 4, 3, 6, 7, 4, 8};
        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[j] != arr[i]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        for (int i = 0; i <j+1 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
