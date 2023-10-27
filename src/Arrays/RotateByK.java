package Arrays;



/*
264.  How to rotate an array left and right by a given number K? (solution)
        🔁 *Input:* [1, 2, 3, 4, 5], K = 2
        🔄 *Output:* Rotated array left and right (e.g., [3, 4, 5, 1, 2])
*/
import java.util.Arrays;
public class RotateByK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;
        int arr1[] = new int[arr.length];
        int start = 0;
        int mid = k + 1;
        for (int i = 0; i < k; i++) {
            arr1[mid] = arr[i];
            mid++;
        }
        for (int i = k; i < arr.length; i++) {
            arr1[start] = arr[i];
            start++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
