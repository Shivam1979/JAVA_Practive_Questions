package Numbers;

import java.util.Scanner;
//🔵 118. 🤖 Write a Java program to check if a given integer is an Armstrong number or not.

public class Armstrong1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to check armstrong");
        int number = sc.nextInt();
        int copy = number;
        String str = String.valueOf(number);
        int count = str.length();
        System.out.println("Count-->" + count);
        int sum = 0;
        while (number > 0) {
            int b = number % 10;
            sum = (int) (sum + Math.pow(b, count));
            System.out.println("number-->" + number);
            number = number / 10;
        }
        System.out.println(sum);
        if (sum == copy) {
        }
    }
}
