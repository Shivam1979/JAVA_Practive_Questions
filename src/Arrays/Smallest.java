package Arrays;
//1. Find the smallest number in an array.
public class Smallest {


    public static void main(String[] args) {
        int [] arr = {65,45,89,98,12,22,56,55};
     int miinn=  minArray(arr);
        System.out.println(miinn);
    }

   public  static int  minArray(int arr[]){

       int min = arr[0];
       for (int i = 0; i < arr.length ; i++) {
           if (arr[i] < min){
               min = arr[i];
           }
       }
      return min;
   }
}
