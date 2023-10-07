package Matrix;

public class SpiralMat {


    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}
        };




        int startCol = 0;
        int startRow = 0;
        int lastCol = arr[0].length-1;
        int lastRow = arr.length-1;
while (startCol<=lastCol && startRow<=lastRow){

        for (int i = startCol; i <=lastCol ; i++) {
            System.out.print(arr[startRow][i]+" ");
        }

        for (int i = startRow+1; i <=lastRow ; i++) {
            System.out.print(arr[i][lastCol]+" ");
        }

        for (int i = lastCol-1; i >=startCol ; i--) {
            System.out.print(arr[lastRow][i]+" ");
        }

        for (int i = lastRow-1; i > startRow; i--) {
            System.out.print(arr[i][startCol]+" ");
        }
        startRow++;
        startCol++;
        lastRow--;
        lastCol--;

}


    }


}
