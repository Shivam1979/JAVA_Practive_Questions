package Arrays;

import java.util.Arrays;

public class GreaterThanAverage {
    //*171. 📈 Find the numbers in an array that are greater than the average of an array*
    public static void main(String[] args) {
        int a[] = {1, 12, 65, 33, 55, 99, 88, 45};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        float d = sum / a.length;
        Arrays.sort(a);
        int gretAve = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i] + "");
            if (a[i] > d) {
                //System.out.println(a[i] + " >" + d);
                gretAve = a[i];
                break;
            }
        }
        System.out.println("the numbers in an array that are greater than the average is  " + gretAve);


    }
}
