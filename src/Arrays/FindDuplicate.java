package Arrays;

public class FindDuplicate {


    /**
     * 257. How do you find the duplicate number on a given integer array? (solution)
     * 🔢 *Input:* [2, 3, 4, 1, 4, 2]
     * 🎲 *Output:* The duplicate number (e.g., 2 or 4)
     */
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 4, 2};
        duplicate(arr);
        duplicatem1(arr);
    }
    static int duplicate(int arr[]) {
        System.out.println("Duplicate number :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
//                System.out.println(i +" "+j);
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");}}}
        return 0;}
    static int duplicatem1(int arr[]) {
        System.out.println();
        System.out.println("Duplicate number :");
        int i = 0;
        int n = arr.length - 1;
        for (int j = 0; j <= n; j++) {
            if (i!=j){
//                System.out.println(i +" "+j);
                if (arr[i] == arr[j]) {
                System.out.print(arr[j] + " ");
                }
            }
         /*   if (arr[i] == arr[j]) {
//                System.out.print(arr[j] + " ");
            }*/
            if (j == n && i < n) {
//                j = -1; problem in buuble sort
//                j = 0;// problem to start again from 0
                j = i+1; // // solvew
//                j = i; // if we want to start from i again
                i++;
            }

            if (j == n && i < n && i != j) {
//                j = -1; problem in buuble sort
//                j = 0;// problem to start again from 0
                j = i+1; //
//                j = i;
                i++;
            }
        }

        return 0;
    }


}
