package Arrays;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicate { //11. Remove duplicates from a sorted array

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6}; // here we are taking a sorted array , if array is not sorted then we will sort .
        // as we know set Data structure only contaion a unique element so we will implement set
       // by using set
        HashSet s = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]); // add the value in set
        }
        Iterator iitr = s.iterator(); // iterate the value
        while (iitr.hasNext()) {
            System.out.print(" "+iitr.next());
        }


    }

}