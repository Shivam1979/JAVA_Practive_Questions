package Arrays;

/**
 *218. *Find the largest contiguous subarray sum (Kadane's algorithm)
 *  in an array:* 📈 (all the three methods) 🧩
 */
public class LongestSumOfSubArray1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, -3, -1, 4, 2, 6, 5, -2, 5};
        method1(arr); // TC--> ncube
        method2(arr); // TC--> n Square
        method3(arr); // TC--> n
    }
    static  void method3(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            sum = sum + arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum<0){
                sum = 0;
            }
        }
        System.out.println("Maximum Value of the SubArray : "+max);
    }
    static void method2(int arr[]){
        int maxx = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            int sum = 0;
            for (int j = i; j < arr.length ; j++) {
                sum = sum + arr[j];
            }
            maxx = Math.max(maxx , sum);
        }
        System.out.println("Maximum sum of Array : " + maxx);
    }
    static void method1(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                max = Math.max(sum, max);
            }
        }
        System.out.println("Largest Sum Of Subarray: "+max);
//        System.out.println(max);
    }
}
