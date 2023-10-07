package Arrays;
//*134. WAP for Bubble sort* 🛁🧼
public class BubbleSort {
    static boolean bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8,1, 1, 1, 3};
        int arr1[] = { 5, 6, 7, 3 , 1, 1, 5, 4};
        bubbleSort(arr);
        bubbleSort(arr1);
        print(arr);
        print(arr1);
    }
    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
