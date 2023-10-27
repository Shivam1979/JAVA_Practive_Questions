package Arrays;

import java.util.Scanner;

/*
6
4 3 7 2 6 1

Sample Output:
3
*/
public class MergeTwo_Array {

    public static void main(String[] args) {
      //  int arr[] = {4, 3, 7, 2, 6, 1};
       // int arr[] = {7,9,2,4,7,4,9,2};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            ranks[i] = scanner.nextInt();
        }

        int cuts = 0;
        int minRank = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (ranks[i] < minRank) {
                cuts++;
                minRank = ranks[i];
            }
        }

        System.out.println(cuts-1);
    }

}
