package Numbers;

import java.util.Scanner;

public class Pal_number {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int check = num;
        int rev = 0;
        while (num > 0) {
            int b = num % 10;
            rev = (rev * 10) + b;
            num = num / 10;
        }
        if (rev == check) {
            System.out.println(check + " number is palindrome");
        } else System.out.println(check + " number  not is palindrome");



    }
}
