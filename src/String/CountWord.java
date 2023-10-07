package String;

import java.util.Arrays;

/**168. 💭 Count the number of words in a string.*
 *  INPUT:- "Prachi Ayushi Tanu Shivam"
 * OUTPUT:  Number of word : 4
 */
public class CountWord {
    public static void main(String[] args) {
     String str = "Ayush1    23i";
     int count =0;
     String strr = "";
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
           if (!Character.isWhitespace(ch)){
                strr = strr + ch;
                count++;
            }

        }
        System.out.println(strr);
        System.out.println(count);






    }
}
