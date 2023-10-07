package Arrays;

import java.util.Arrays;

public class TwoEqulArray {

    public static void main(String[] args) {
        int arr1 []  = {2,4,6,8};
        int arr2 []  = {8,4,6,2};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean b = Arrays.equals(arr1,arr2);
        System.out.println(b);
    }

}
