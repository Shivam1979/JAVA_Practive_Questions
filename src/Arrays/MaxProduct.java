package Arrays;

/**
 * 313. Find the Maximum Product of Two Integers in an Array: 🧮
 * - 🎲 Input: [2, 3, 4, 5, 6]
 * - 🎯 Output: Maximum product: 30
 */
public class MaxProduct {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int maxProduct = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (product > maxProduct){
                    maxProduct = product;
                }
            }
        }
        System.out.println("Maximum product of two integer is : "+maxProduct);
    }
}
