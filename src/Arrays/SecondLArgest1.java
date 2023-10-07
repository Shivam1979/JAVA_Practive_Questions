package Arrays;

public class SecondLArgest1 {
    //*166. 🤔 Find the second smallest element in an array in Java? ((Without Sorting 😆)*

    public static void main(String[] args) {
        int arr[] = { 7, 20, 11, 10 ,56,98,10};
        System.out.println( secondLArg(arr));
    }
    static int secondLArg(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        int secondLArge = 0;
        for (int i = 0; i <arr.length ; i++) {
           if (secondLArge< arr[i] && arr[i] <largest) {
               secondLArge = arr[i];
           }
        }
        return secondLArge;
    }
}
