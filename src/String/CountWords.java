package String;

import java.util.Scanner;

public class CountWords {
    static int countWord(String str) {
        String words[] = str.split("\\s");
        return words.length;
    }
    public static void main(String[] args) {
        System.out.println("Enter a Sentance ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Number of Words in Scentance : "+countWord(str));
        scan.close();
    }
}
