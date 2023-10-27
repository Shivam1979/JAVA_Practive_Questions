package Arrays;

import java.util.Arrays;

/**
 * 266. How do you reverse an array in place in Java? By 2 pointer
 *     🔄 *Input:* [4, 5, 1, 2]
 *     🔁 *Output:* Reversed array (e.g., [2, 1, 5, 4])
 */
public class ReverseArray2Pointer {

    public static void main(String[] args) {
        int arr [] = {4,5,1,2};
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            //swap the both index element
            int swap   = arr[start];
            arr[start] = arr[end];
            arr[end] = swap;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
