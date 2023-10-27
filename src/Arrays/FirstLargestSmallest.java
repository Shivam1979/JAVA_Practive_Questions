package Arrays;

public class FirstLargestSmallest {
    /**
     * 258. How do you find the largest and smallest number in an unsorted integer array? (solution)
     * 🧮 *Input:* [7, 2, 3, 1, 5]
     * 🏅 *Output:* The largest number (e.g., 7) and the smallest number (e.g., 1)
     *
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = {7, 2, 3, 1, 5};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
                 if (arr[i] >max ){
                     max = arr[i];
                 }
                 if (arr[i] <min ){
                     min = arr[i];
                 }
        }
        System.out.println("Max Value : "+max);
        System.out.println("Min Value : "+min);
    }
}
