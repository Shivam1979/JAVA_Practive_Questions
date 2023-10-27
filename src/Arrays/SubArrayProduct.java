package Arrays;

/**
 * 336. Find the Maximum Subarray Product:
 * - Input:
 * Array: [2, 3, -2, 4]
 * - Output:
 * Contiguous Subarray with the Largest Product: [2, 3]
 */
public class SubArrayProduct {

    public static void main(String[] args) {
        int arr[] = {2, 3, -2, 4};
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product = product * arr[j];
//                System.out.println(product + "+ ");
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        System.out.println("Max product : "+maxProduct);
    }
}
