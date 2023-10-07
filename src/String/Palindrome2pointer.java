package String;

import java.util.Scanner;
//181. *Check if a string is a palindrome using the two  pointer approach.* 🔄
public class Palindrome2pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check Palindrome");
        String str = new String(sc.nextLine());

        int j = 0;
        int k = str.length()-1;
        while (k>j){
            if (str.charAt(j)  != str.charAt(k)){
                System.out.println(str+" is not a Palindrome");
                break;
            }else
            j++;
            k--;
        }

    }
}
