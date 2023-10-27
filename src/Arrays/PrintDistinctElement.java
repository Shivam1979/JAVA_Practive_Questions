package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 328. Counting Distinct Elements in an Array: 🧮
 * Input: arr[] = {10, 20, 20, 10, 30, 10}
 * Output: 3
 */
public class PrintDistinctElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 30, 10};
        int n = arr.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                result = arr[i];
                break;
            }
        }
        System.out.println("Value that occurs only once in the array: " + result);
    }
}
