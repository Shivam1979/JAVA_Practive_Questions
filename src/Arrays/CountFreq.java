package Arrays;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Count the frequency of each element in an array
 * Test Case:
 * I/P: [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
 * O/P: {1: 1, 2: 2, 3: 3, 4: 4}
 */


public class CountFreq {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if (freq.containsKey(arr[i])){
                freq.put(arr[i], freq.get(arr[i])+1);
            }else {
                freq.put(arr[i] ,1);
            }
        }
        System.out.println(freq);
    }
}
