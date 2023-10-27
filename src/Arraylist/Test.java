package Arraylist;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        String str = "this is an amazing program";
        String arr[] = str.split("\\s");
        System.out.println(Arrays.toString(arr));
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
