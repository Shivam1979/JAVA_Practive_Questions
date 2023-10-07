package String;

import java.util.Scanner;

//1. How do you reverse a string in Java?
public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String rev = "";
        for (int i = str.length()-1; i >= 0  ; i--) {

            rev = rev + str.charAt(i);
        }
        if (rev.equals(str)){
            System.out.println("Palindrome string");
        }

    }


}
