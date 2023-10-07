package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxMinInArray {
    static String MaxMin(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length-1)- i; j++) {
                if (arr[j] > arr[j + 1]) {
                   arr[i] = arr[j] - arr[j+1];
                   arr[j] = arr[j] - arr[j+1];
                   arr[i] = arr[j] + arr[j+1];
                }
            }
        }
        return "Min : "+arr[0] +" "+ "Max : "+arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = {12,65,89,87,56,45,465};
        List <String> l = new ArrayList<>();
        l.add(MaxMin(arr));
        //MaxMin(arr);
        System.out.println(l);

    }
}
