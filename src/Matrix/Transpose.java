

package Matrix;


// *97. Transpose of matrix

/**
 * Transpose of matrix means the we need to change the row by column and column by row
 * step 1 : we need to run two loop in row and column
 * Step 2  : change i == j and j == i
 */
public class Transpose {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
