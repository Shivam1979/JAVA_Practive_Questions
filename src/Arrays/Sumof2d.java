package Arrays;

public class Sumof2d {

//17.Create a 2 d matrix of 3 * 3 and insert the data and find the sum of all the values;
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        int total = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                total = total + arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total sum of value " + total);
    }


}

