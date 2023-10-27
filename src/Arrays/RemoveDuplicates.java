package Arrays;

import java.util.Arrays;

/**
 * 261. How to remove duplicates from a given array in Java? (solution)
 * Input:* [3, 4, 3, 6, 7, 4, 8]
 * Output:* Array without duplicates (e.g., [3, 4, 6, 7, 8])
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {3, 4, 3, 6, 7, 4, 8};
        Arrays.sort(arr);
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < i + 1; j++) {
            System.out.print(arr[j] + "  ");
        }
    }
}

