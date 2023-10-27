package String;

/**
 * 271. *How do you reverse a given string in place? (Optimized code)*
 *     - *Input:* "hello" 👉
 *     - *Output:* "olleh" 👈
 */

public class ReverseString {
    static String reverseString (String str){
        char ch  [] = str.toCharArray();
        int end = ch.length-1;
        int start = 0;
        while (end>=start){
            //swap
            char c = ch[start];
            ch[start] = ch[end];
            ch[end] = c;
            end--;
            start++;
        }
        String bag = new String(ch);
        return bag;
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));
    }
}
