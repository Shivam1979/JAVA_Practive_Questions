package Numbers;

import java.util.Scanner;

public class Armstrong_ndigit {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check armstrong number");
        int n = sc.nextInt();
        int temp = n;
        int ld = 0;
        while (temp > 0) {
            ld++;
            temp = temp / 10;
        }
       // System.out.println(ld);
        temp = n;
        double sum = 0;
        while (temp > 0) {
            int b = temp % 10;
            sum = sum + Math.pow(b, ld);
            temp = temp /10;
        }
        if (sum == n){
            System.out.println("Number is armstrong");
        }else System.out.println("Not a armstrong");


    }

}
