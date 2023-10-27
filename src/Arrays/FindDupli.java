package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 311. *How do you find duplicate numbers in an array if it contains multiple duplicates? (solution)*
 *    🎲 *Input:*
 *    - Input array: [3, 4, 3, 6, 7, 4, 8]
 *    🎯 *Output:*
 *    - The duplicate numbers:3,4
 */
public class FindDupli {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        int arr [] = {3, 4, 3, 6, 7, 4, 8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j]){
                    ar.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println(ar);
    }
}
