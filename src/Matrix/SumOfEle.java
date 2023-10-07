package Matrix;

public class SumOfEle {

    //*71. Java Program to find the sum of all elements in a matrix*
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4},
                {44, 90, 78},
                {22, 12, 23}};
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
