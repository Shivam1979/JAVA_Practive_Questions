package Numbers;

import java.util.Scanner;

public class Replace0by1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that you want to change 0 by 1 :");
        int  n = sc.nextInt();

   /*     if (num == 0) {
            System.out.println("1");
        }
        int ans = 0;
        int tmp = 1;
        while (num > 0) {
            int d = num % 10;
            if (d == 0) {
                d = 1;
            }
            ans = d * tmp + ans;
            tmp = tmp * 10;
            num = num / 10;

        }*/
        int num =0;
        int temp =1;
        while (n>0){
            int b = n%10;
            if (b==0){
                b=1;
            }
            num = (b * temp)+ num;
            temp = temp * 10;
            n = n/10;
        }
        System.out.println( num);

    }
}
