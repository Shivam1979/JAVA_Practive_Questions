package String;


import java.awt.*;
import java.util.Scanner;

public class CountVowel {

    static int CountV(String str){
        int count = 0;
   String s =  str.toLowerCase() ;
        for (int i = 0; i < s.length() ; i++) {
            /*if ('a'== s.charAt(i) || 'e'== s.charAt(i) ||'i'== s.charAt(i) ||'o'== s.charAt(i) ||'u'== s.charAt(i) ){
                count++;
            }*/
            if (97 == s.charAt(i) || 101 == s.charAt(i) ||105 == s.charAt(i) ||111 == s.charAt(i) ||117 == s.charAt(i) ){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  str = sc.nextLine();

       int num_of_vowel= CountV(str);
        System.out.println(num_of_vowel);
    }
}
