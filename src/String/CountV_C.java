package String;

import java.util.Scanner;

public class CountV_C {
    static void countA_C(String str) {
        str = str.toLowerCase();
        System.out.println(str);
        StringBuilder sb = new StringBuilder(str);
        int countVowel = 0;
        int countConso = 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowel++;
            } else countConso++;

        }
        System.out.println("Number of Vowel : "+countVowel);
        System.out.println("Number of Consonents : "+countConso);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        countA_C(str);
        sc.close();
    }
}
