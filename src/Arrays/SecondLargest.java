package Arrays;

//Second Largest
public class SecondLargest {
    public static void main(String[] args) {
     int[] arr = {12,56,54,89,87,2,12,1,9};
     int n = arr.length-1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i ; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr[n-1]);
    }
}
