package Numbers;

import java.util.Scanner;
//🔵 118. 🤖 Write a Java program to check if a given integer is an Armstrong number or not.

public class Armstrong1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to check armstrong");
        int n = sc.nextInt();
        int copy = n;
        String str = String.valueOf(n);
        int count = str.length();
        System.out.println("Count-->" + count);
        int sum = 0;
        while (n > 0) {
            int b = n % 10;
            sum = (int) (sum + Math.pow(b, count));
            System.out.println("n-->" + n);
            n = n / 10;
        }
        System.out.println(sum);
        if (sum == copy) {
            System.out.println("Given number is Number is Armstrong ");

        }

    }

}
