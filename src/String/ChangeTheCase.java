package String;

import java.util.Scanner;

/**
 292. Change the case of each character in a string
 Test Case:
 I/P: "HelloWorld"
 O/P: "hELLO wORLD"
 */
public class ChangeTheCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String bag = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch+32);
                bag = bag + ch;
            }else if (ch >= 'a' && ch <= 'z'){
                ch = (char) (ch-32);
                bag = bag + ch;
            }
        }
        System.out.println(bag);

    }
}
