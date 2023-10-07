package String;
//1. Write a program to count vowels and consonants.

import java.util.Scanner;

public class Count_V_C {

    static void vowelConsonents(String str) {
        int Vow = 0;
        int cons = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                Vow++;
            } else if (ch >= 'a' && ch <= 'z') {
                cons++;
            }
        }
        System.out.println("Number of vowels : " + Vow);
        System.out.println("Number of consonents : " + cons);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = s.toLowerCase();
        vowelConsonents(str);

    }
}
