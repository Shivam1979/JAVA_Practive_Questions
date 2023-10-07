package Numbers;

import java.util.Scanner;

public class LargestOfThree {


    static void large3(int a , int b, int c){
        int temp ,largest;
        temp=a>b?a:b;
        largest=c>temp?c:temp;

        System.out.println(largest);
       /* if (a>b){
            if (a>c){
                System.out.println(a+" is Greater than "+b+" and "+c);
            }
        }else if (b>c){
            System.out.println(b+" is Greater than "+c);
        }else System.out.println(c +" is Greater than "+b);*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        large3(a,b,c);


    }
}
