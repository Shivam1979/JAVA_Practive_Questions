package Arrays;
//*133. Remove duplicates from array* 🔄🚫
import java.util.Collections;
import java.util.HashSet;

public class Duplicate_remove {
    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }
    public static void main(String[] args) {
        // Method 1 by Using set ,  beacause set cannot store the duplicate values
        
        //Method 2 : by using 2 pointer approach
        int arr[] = {1, 1, 1, 3, 4, 5, 6, 7, 8};
        int arr1[] = {1, 1, 5, 4, 5, 6, 7, 3};
        int j =0;
        for (int i =1 ; i <arr.length ; i++) {
            if (arr[j]!= arr[i]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        System.out.println("Total number of unique element "+(j+1));
        print(arr);
    }
}
