package Matrix;

import java.util.Arrays;

/**
 * 317. *Set Zero in Row and Column for Each 0 Element:* 🏗
 * - I/P:
 * [[1, 2, 3, 4],
 * [5, 6, 7, 8],
 * [9, 0, 1, 2],
 * [3, 4, 5, 0]]
 * - O/P:
 * [[1, 0, 3, 0],
 * [5, 0, 7, 0],
 * [0, 0, 0, 0],
 * [0, 0, 0, 0]]
 */
public class Set0Matrix {
    static void make1(int arr[] [] , int i , int j){
        for (int k = 0; k <arr.length ; k++) {
            arr[i][k] = -1;
            arr[k][j] = -1;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2},
                {3, 4, 5, 0}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    make1(arr , i , j);
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }





        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
