package Numbers;

import java.util.Scanner;
//2) factorial by recursion
public class FactorialRec {
    static  int Factorial(int n ){
        if (n == 0){
            return 1;
        }else  return  n * Factorial(n-1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = Factorial(n);
        System.out.println(fact);

    }
}
