package Arrays;
//6) binary search
public class Binary {
    static String binarySearch(int[] arr, int key) {
        int n = arr.length - 1;
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return "Found at index no "+mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
        }
        return "Not found";
    }

    public static void main(String[] args) {
        int[] arr = {12, 32, 65, 89, 54};
        int key = 32;
        String s = binarySearch(arr, key);
        System.out.println(s);

    }

}
