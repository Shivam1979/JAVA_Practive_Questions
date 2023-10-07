package Numbers;

import java.util.Scanner;
//3. Check if a number is an Armstrong number with three digits.

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        double sum = 0;
        while (n > 0) {
            int b = n % 10;
            sum = sum + Math.pow(b, 3);
            n = n/10;
        }
        System.out.println(temp);
        if (temp == sum){
            System.out.println("armstrong number");
        }else System.out.println("Not a armstrong");
    }
}
