package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemDupli {


    public static void main(String[] args) {
        HashSet hs = new HashSet();
        int[] arr = {2, 5, 2, 2, 5, 8, 9, 3, 5, 6, 89, 65, 56, 89, 44, 23};
        for (int i = 0; i <arr.length ; i++) {
            hs.add(arr[i]);
        }


        System.out.println(hs);
    }

}
