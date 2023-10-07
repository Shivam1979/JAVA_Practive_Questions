package Numbers;

import java.util.Scanner;

public class Leap_year {

    public static void main(String[] args) {
        System.out.println("Enter a year ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();


        if (year % 400 == 0){
            System.out.println(year+" is leap year");
        }else if (year % 100 != 0  && year % 4==0){
            System.out.println(year+" is a leap year ");
        }else System.out.println(" Not a leap year ");



    }


}
