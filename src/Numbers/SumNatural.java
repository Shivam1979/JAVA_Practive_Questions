package Numbers;

import java.util.Scanner;

public class SumNatural {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int a = 5;
        int sum = 0;
        while (a >= 0) {
            sum = sum + a;
            a--;
        }
        System.out.println(sum);
    }
}
