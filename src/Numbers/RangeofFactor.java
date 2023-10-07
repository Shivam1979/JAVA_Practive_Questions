package Numbers;

import java.util.Scanner;

public class RangeofFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number to find the factor  : ");
        System.out.println("Enter Starting value ");
        int a = sc.nextInt();
        System.out.println("Last value ");
        int b = sc.nextInt();


        for (int i = a; i <=b/2 ; i++) {
            if (b%i==0){
                System.out.println(i+" ");
            }
        }
    }
}
