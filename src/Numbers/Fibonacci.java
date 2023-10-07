package Numbers;
//2) Fibonacci by recursion and method

import java.util.Scanner;

public class Fibonacci {

    static  int byRec(int n ){
        if (n==0){
            return 1;
        }else  return n * byRec(n-1);
    }

    static int byMethod(int n ){
        int num = 1;
        while (n>=1){
            num = num * n;
            n--;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        System.out.print( "By Recursion : ");
        System.out.print (byRec(n) + " ");
        System.out.println();
        System.out.print( "By Method : ");
        System.out.print(byMethod(n)+ " ");
    }
}
