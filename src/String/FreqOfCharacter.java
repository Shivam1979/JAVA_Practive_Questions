package String;

import java.util.Scanner;

/**
 * 293. Write code to Calculate the frequency of characters in a string
 * Test Case:
 * I/P: "hello"
 * O/P: {'h': 1, 'e': 1, 'l': 2, 'o': 1}
 */
public class FreqOfCharacter {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int freq [] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int num = ch;
            freq[num]++;
        }
        for (int i = 0; i <256 ; i++) {
            if (freq[i]>=1){
                System.out.println((char)i +":"+freq[i]);
            }

        }
    }
}
