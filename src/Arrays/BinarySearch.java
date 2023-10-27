package Arrays;

public class BinarySearch {
    /**
     * 270. How do you perform a binary search in a given array? (solution)
     * 🎯 *Input:* Sorted array [1, 2, 3, 4, 5, 6, 7], Target = 3
     * 🎯 *Output:* Index of the target value (e.g.,2
     */

    static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int n = arr.length - 1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5, 6, 7};
        int key = 0;
        int a = binarySearch(arr, key);
        if (a == -1){
            System.out.println("Key not found");
        }else System.out.println("Key found at index : "+binarySearch(arr,key));
    }
}
