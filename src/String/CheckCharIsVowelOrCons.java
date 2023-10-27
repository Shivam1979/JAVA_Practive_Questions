package String;

import java.util.Scanner;

public class CheckCharIsVowelOrCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char ch = sc.next().charAt(0);
        if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'||
        ch =='A' || ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
            System.out.println("Given char '"+ch+"' is Vowel");
        }else if (Character.isAlphabetic(ch)){
            System.out.println("Given char '"+ch+"' is Consonants");
        }
    }
}
