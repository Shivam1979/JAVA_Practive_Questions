package Arrays;

import java.util.HashSet;

public class RemoveDupliUnsort { //11. Remove duplicates from a sorted array
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;}}}}
    public static void main(String[] args) {
        int arr[] = {2, 2, 6, 6, 4, 5,  3, 5,}; // here we are taking a sorted array , if array is not sorted then we will sort .
        // as we know set Data structure only contaion a unique element so we will implement set
        // by using set
        // without performing sorting hashset give the unique
        sort(arr);
        HashSet s = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
             }
        System.out.println("Number of unique element " + s.size());
        System.out.println(s);
    }



}