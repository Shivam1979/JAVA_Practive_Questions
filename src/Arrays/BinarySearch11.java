package Arrays;

public class BinarySearch11 {
    static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 9, 12, 45, 67, 89, 87, 90};
        System.out.println("Key will find at Index : " + binarySearch(arr, 12));
        System.out.println("Key will find at Index : " + binarySearch(arr, 23));
        System.out.println("Key will find at Index : " + binarySearch(arr, 56));
    }

}
