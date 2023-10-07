package Matrix;

public class SpiralPrint {



    static void Spirall(int arr[][]){

        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;


        while (startCol <= endCol && startRow <= endRow) {

            // for first line
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");

            }
            for (int i = endCol - 1; i >= startCol; i--) {
                System.out.print(arr[endCol][i] + " ");
            }
            for (int i = endRow - 1; i > startRow; i--) {
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }

    }
    public static void main(String[] args) {
        int arr[][] = {{1,   2, 3, 4},
                       {5,  6,  7, 8},
                       {9, 10, 11,12},
                       {13, 14,15,16}

        };
        Spirall(arr);
        System.out.println("  ");
        // for index printing
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(i + "" + j + " - ");
            }
            System.out.println();
        }


    }
}
