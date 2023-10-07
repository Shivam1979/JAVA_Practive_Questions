package Arrays;
//4. Reverse a given array.
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {65, 45, 89, 98, 12, 22, 56, 55};
        reverse(arr);
//read array
        for (int read : arr
        ) {
            System.out.println(read);
        }
    }

 /*   static void reve(int arr[]) {
        int neww[] = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[arr.length-1-i];

        }
*/

   static void reverse(int arr[]){
       int start = 0;
       int end = arr.length-1;

       for (int i = 0; i < arr.length; i++) {
           while (start < end){
               //swap
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
           }

       }
    }
}
