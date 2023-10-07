package Matrix;
//98. Java Program to subtract the two matrices
public class Subtract {


    public static void main(String[] args) {


           int arr[][] = {{3, 2, 3},
                {4, 8, 6},
                {7, 8, 10}};

         int arr1[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
              arr[i][j] = arr[i][j] - arr1[i][j];
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
