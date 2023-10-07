package Matrix;

//25. Java Program to find the sum of each row and each column of a matrix
public class Matrix_printrowcol {
    public static void main(String[] args) {
        int arr[][] = {{1, 3, 5, 65},
                    {3, 6, 8, 90},
                {8, 9, 5, 21},
                {8, 9, 5, 44}
        };
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+"--");
            }
            System.out.println();
        }

        int startCol = 0;
        int startRow = 0;
        int endCol = arr[0].length - 1;
        int endRow = arr.length - 1;
        int c1 = 0;
        for (int i = 0; i <= endCol; i++) {
            c1 = c1 + arr[i][startCol];
        }
        System.out.println("Sum of column 0 : " + c1);
        int c2 = 0;
        for (int i = startCol; i <= endCol; i++) {
            c2 += arr[i][startCol + 1];
        }
        System.out.println("Sum of column 1 : " + c2);
        int c3 = 0;
        for (int i = startCol; i <= endCol; i++) {
            c3 += arr[i][endRow-1 ];
        }
        System.out.println("Sum of column 2 : " + c3);
        int c4 = 0;
        for (int i = startCol; i <= endCol; i++) {
            c4 += arr[i][endRow];
        }
        System.out.println("Sum of column 3 : " + c4);

          int r1 = 0;
        for (int i = startCol; i <= endCol; i++) {
            r1 += arr[startRow][i];
        }
        System.out.println("Sum of row 0 : " + r1);

          int r2 = 0;
        for (int i = startCol; i <= endCol; i++) {
            r2 += arr[startCol][startCol+1];
        }
        System.out.println("Sum of row 1 : " + r2);

          int r3 = 0;
        for (int i = startCol; i <= endCol; i++) {
            r3 += arr[startCol][endCol-1];
        }
        System.out.println("Sum of row 2 : " + r3);

          int r4 = 0;
        for (int i = startCol; i <= endCol; i++) {
            r4 += arr[startCol][endRow];
        }
        System.out.println("Sum of row 3 : " + r4);




    }
}
