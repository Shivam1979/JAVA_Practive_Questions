package Arrays;
//4) sort the array
import java.util.Scanner;
public class sort {
    static  void  bubbleSort(int[] arr){
        for (int i = 0; i <  arr.length; i++) {
            for (int j = 0; j < (arr.length-1)-i ; j++) {
                if (arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }
    static void  readArr(int[] arr){
        for (int read : arr
             ) {
            System.out.print(read+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("Unsorted array");
        readArr(arr);
        bubbleSort(arr);
        System.out.println();
        System.out.println("Sorted array");
        readArr(arr);
     //   System.out.println("Sorted array");
    }
}
