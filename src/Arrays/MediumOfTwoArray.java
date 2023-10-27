package Arrays;

/**
 * 302. *How to find the median of two sorted arrays? (solution)*
 * 🎲 *Input:*
 * - A = [1, 3, 5]
 * - B = [2, 4, 6]
 * 🎯 *Output:*
 * - Median value (e.g., 3.5)
 */
public class MediumOfTwoArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 5};
        int b[] = {2, 4, 6};
        int aSum = 0;
        int bSum = 0;
        for (int i = 0; i < a.length; i++) {
            aSum+=a[i];
            bSum+=b[i];
        }
        float med = (aSum + bSum) /(a.length+b.length);
        System.out.println("Median of Both array is : "+med);
    }
}
