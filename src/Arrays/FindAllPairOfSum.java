package Arrays;
/**
 * 259. How do you find all pairs of an integer array whose sum is equal to a given number? (solution)
 * ➕ *Input:* [3, 4, 5, 6, 7], Sum = 10
 * 🤝 *Output:* Pairs with the given sum (e.g., (3, 7), (4, 6))
 */
public class FindAllPairOfSum {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7};
        int sum = 10;
        System.out.print("e.g..");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    System.out.print("("+arr[i] + "," + arr[j]+")");
                }
            }
        }
    }
}
