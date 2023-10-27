package Arrays;

public class Selectionn { // selection sort
    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {32, 54, 23, 65, 87, 98, 12, 22, 34};
        bubble(arr);
        System.out.print("{");
        printt(arr);
        System.out.print("}");
    }

    static void printt(int arr[]) {
        for (int read : arr) System.out.print(read + " ,");
    }
}
