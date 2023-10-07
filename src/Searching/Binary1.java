package Searching;

public class Binary1 {


    static int findNum(int arr[], int key) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l)/ 2;
            if (arr[m] == key)
                return m;
            if (arr[m] < key)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        // Binary search work obly in sorted array
        int[] arr = {1, 4, 8, 12, 34, 56, 90, 111, 234, 345, 567, 678, 989};
       int key [] = {1,11,12,34,56,55,33,989};
        for (int i = 0; i < key.length; i++) {
            int value = findNum(arr ,key[i]);
            if (value == -1){
                System.out.println("Not present");
            }else System.out.println(key[i]+" Present at   index : " + value);

        }
        // Step 1 : first we decalare a start and end index;

        //System.out.println(findNum(arr, key));


    }
}
