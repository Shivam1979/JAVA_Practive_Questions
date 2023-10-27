package Numbers;

import java.util.Scanner;

/**
 * 289. *Write a program to find the sum of Natural Numbers using Recursion.* ➕
 * Input Case:*
 * Number: 5
 * Output Case:*
 * Sum of first 5 natural numbers is 15.
 */
public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int bag = 0;
        for (int i = 1; i <= n; i++) {
            bag = bag + i;
        }
        System.out.println("Sum of All natural number is : " + bag);
    }
}
