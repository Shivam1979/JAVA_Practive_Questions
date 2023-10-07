package Matrix;
// 99. 8. Java Program to find the number of odd & and even numbers in the given matrix

public class CountOddEven {

    public static void main(String[] args) {
        int arr[][] = {{3, 2, 3},
                {4, 8, 6},
                {7, 8, 10}};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i <arr[0].length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]%2==0){
                    countEven ++;
                }else countOdd++;
            }
        }
        System.out.println("Number of Even value in matrix : "+countEven);
        System.out.print("Number of Odd value in matrix : "+countOdd);


    }
}
