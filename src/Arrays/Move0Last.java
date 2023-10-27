package Arrays;

import java.util.Arrays;
public class Move0Last {
    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 2, 0, 6, 7, 0, 1, 0, 1, 2, 0, 0};
        int nonzero = 0;
        int zero = 0;
        while (nonzero < arr.length) {
            if (arr[nonzero] != 0) {
                int swap = arr[zero];
                arr[zero] = arr[nonzero];
                arr[nonzero] = swap;
                nonzero++;
                zero++;
            } else nonzero++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
