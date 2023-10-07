package Arrays;

import java.util.Scanner;

public class Fact {
    static int factorial(int n) {
        int f = 1;
        while (n > 0) {
            f = f * n;
            n--;
        }
        return f;
    }
    static int facRec(int n) {
        if (n == 0 || n == 1){
            return 1;
        }else return n * facRec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find a Factorial : ");
        int n = sc.nextInt();
        System.out.println("By Method    : "+factorial(n));
        System.out.println("By Recursion : "+facRec(n));
    }
}
