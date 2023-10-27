package String;

import java.util.Arrays;

public class Anagram {
//273. *How do you check if two strings are anagrams of each other?*

    public static void main(String[] args) {
        int x;
        int col = 1;
        for (int i = 9; i >=6 ; i--) {
            x = i;
            for (int j = 0; j <=col ; j++) {
                System.out.print(x+" ");
                x = x+2;
            }

            col ++;
            System.out.println();

        }

    }
}
