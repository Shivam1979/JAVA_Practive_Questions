package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 2. *Remove Duplicates From an Unsorted Array*
 * - *Input:* [2,2,2,5,6,]
 * - *Output:* [5, 2, 6, 8]
 */
public class RemoveAllDuplic {
    static void removeUnsortedDupli(int arr[]) {
        int freq[] = new int[arr.length];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = 1;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                for (int j = i + 1; j < freq.length; j++) {
                    if (arr[i] == arr[j]) {
                        freq[j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                System.out.print(arr[i] + ",");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 9, 3, 1, 3, 9};
        removeUnsortedDupli(arr);
        System.out.println();
        duplicate(arr,arr.length);
    }

    static void duplicate(int arr[], int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!mp.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
                mp.put(arr[i],999);
            }
        }
    }
}
