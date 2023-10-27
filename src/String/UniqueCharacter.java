package String;

import java.util.Scanner;

public class UniqueCharacter {
    // input :  shivamsingh
    // output : vamng //  vmsingh

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String store = "";
        int freq[] = new int[256];
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int num = ch;
            freq[num]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] >= 1) {
                System.out.println((char) i + " - " + freq[i]);

            }

        }

    }
}
