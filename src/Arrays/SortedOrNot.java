package Arrays;
// *132. Check the array is Sorted or not* 🧐📊
public class SortedOrNot {
    static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                   return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 3, 4, 5, 6, 7, 8};
        int arr1[] = {1, 1, 5, 4, 5, 6, 7, 3};
        if (isSorted(arr)){
            System.out.println("Array is sorted ");
        }else System.out.println("Array is not sorted ");

        print(arr);
    }
    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
