package Numbers;

/**
 * 339. Find Missing Number in a Sequence:
 * - Input:
 * Sequence: [1, 2, 3, 5, 6]
 * - Output:
 * Missing Number: 4
 */
public class MissingNum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6};
        int sumAll = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sumAll += arr[i];
        }
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            sum += i;
        }
        System.out.println("Missing Number is :" + (sum - sumAll));
    }
}
