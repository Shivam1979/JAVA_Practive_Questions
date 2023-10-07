package Matrix;

// 29. Java Program to find the frequency of odd & and even numbers in the given matrix
public class CountEvenOdd {
    public static void main(String[] args) {
        int arr[][] = {{1, 3, 5, 65},
                {3, 6, 8, 90},
                {8, 9, 5, 21},
                {8, 9, 5, 44}
        };
        int evenSum = 0;
        int e = 0;
        int oddSum = 0;
        int o = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evenSum += arr[i][j];
                    e++;
                } else {
                    oddSum += arr[i][j];
                    o++;
                }
            }
        }
        System.out.println("Even Sum is : " + evenSum + " and its frequency is : " + e);
        System.out.println("Odd Sum is : " + oddSum + " and its frequency is : " + o);
    }
}
