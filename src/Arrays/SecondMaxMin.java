package Arrays;
//3. Second Smallest and Second Largest
public class SecondMaxMin {
    public static void main(String[] args) {
     /*   Step 1- first we sort the array
        Step 2 - we return the value for
                               2nd_max = arr(n-2)
                               2nd_min = arr(1);
        */
        int[] arr = {65, 45, 89, 98, 12, 22, 56, 55};
        max_min(arr);
    }

    static void max_min(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;}}}
        System.out.println("Second Smallest in array is : " + arr[1]);
        System.out.println("Second Largest in array is : " + arr[arr.length - 2]);
    }
}
