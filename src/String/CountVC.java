package String;

import java.util.concurrent.CyclicBarrier;

public class CountVC {

    static void count(String str) {
        int vowel = 0;
        int cons = 0;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          if (ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o'|ch == 'u' ){
              vowel++;
          }else if (Character.isAlphabetic(ch) && !(ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o'|ch == 'u' )){
              cons++;
          }
        }
        System.out.println("Number of Vowel: "+vowel);
        System.out.println("Number of Consonents: "+cons);
    }

    public static void main(String[] args) {
        String str = "Shivam";
        count(str);
    }
}
