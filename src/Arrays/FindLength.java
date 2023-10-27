package Arrays;

import java.util.Scanner;

public class FindLength {


    public static void main(String[] args) {
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char ch[] = str.toCharArray();
        int length = 0;
        for (char c : ch ) {
            length++;
        }
        System.out.println("Length of String : "+(length-1));
    }
}
