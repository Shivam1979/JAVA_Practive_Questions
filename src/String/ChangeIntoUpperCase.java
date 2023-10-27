package String;
/**
 * 219. *Change all the lowercase letters into an uppercase in a string:* 🔠
 */
public class ChangeIntoUpperCase {
    public static void main(String[] args) {
        String str = "shivam";
        String str1 ="";
        for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           if (ch >= 'a' && ch <= 'z'){
               char c = (char) (str.charAt(i)-32);
               str1 = str1 + c;
           }
        }
        System.out.println(str1);
    }
}
