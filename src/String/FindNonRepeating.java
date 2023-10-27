package String;
/**
 * 294. Find non-repeating characters in a string
 * Test Case:
 * I/P: "hello"
 * O/P: 'heo'
 */

import java.util.Scanner;

public class FindNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        String str = sc.nextLine();
        int freq [] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i <256 ; i++) {
            if (freq[i]==1){
                System.out.print((char) i );
            }

        }
    }
}
