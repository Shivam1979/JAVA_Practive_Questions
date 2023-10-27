package Numbers;

import java.util.Scanner;

/**
 * 288. *Write the code for Armstrong number* 🔢
 * *Input Case:*
 * Number: 153
 * *Output Case:*
 * 153 is an Armstrong number.
 */
/*

24
2 * 2 + 4 *4
4 + 16= 20
153
1cube + 5 cube  + 3 cude
1 + 125 + 27;
153;
*/

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = num;
        int a   = num;
        int len = 0;
        while (num > 0) {
            num = num / 10;
            len++;
        }
        int sum = 0;
        while (n1>0){
            int b = n1%10;
            sum  = (int) (sum + Math.pow(b,len));
            n1 = n1 /10;
        }
        if (sum ==a){
            System.out.println(a+" is armstrong");
        }else  System.out.println(a+" is not armstrong");




    }
}
