package Arrays;

public class MaxSubArray {
    //175. Implement a Java program to find the maximum subarray sum
    static int max(int arr[]) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                maximum = Math.max(sum, maximum);
            }
        }
        return maximum;
    }
    static int max1(int arr[]) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            for (int j = i ; j< arr.length; j++) {
                sum = sum + arr[j];
                maximum = Math.max(sum, maximum);
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 7, -3};
        System.out.println("TC: O(n*n*n)  {BRUTE FORCE}     Maximum Subarray : " + max(a)); //TC : nearer to N Cube
        System.out.println("TC: O(n*n)      {BETTER SOLn }     Maximum Subarray : "+max1(a));
    }
}
