package Arrays;

import java.util.Arrays;

/**
 * How to find non repeated elements..
 * Input = [2,3,1,2,3,4,5];
 * Output = 1
 */
public class PrintNonRepeted {
    public static void main(String[] args) {
        int arr[] = {1,2,-1,1,3,1};
        int freq[] = new int[arr.length];
        System.out.println("Input :"+Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int count =-1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            freq[i] = count;
        }
        for (int i = 0; i <freq.length ; i++) {
            if (freq[i] == 0){
                System.out.println("Output : "+arr[i]);
            }
        }
    }
}
