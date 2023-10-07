package String;
//*59. How would you write a program to check whether two strings are anagrams?*
import java.util.Arrays;
public class AnagramString {
    public static void main(String[] args) {
        String ss = "Integral";
        String sss = "triangle";
        System.out.println(ana(ss , sss));
    }
    static boolean ana(String ss, String sss) {
        String s1 = ss.toLowerCase();
        String s2 = sss.toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char s3[] = s1.toCharArray();


            char s4[] = s2.toCharArray();

            Arrays.sort(s3);
            Arrays.sort(s4);
            for (int i = 0; i < s3.length; i++) {
                System.out.print(s4[i]+" ");
            }
            System.out.println();
            for (int i = 0; i < s3.length; i++) {
                System.out.print(s3[i]+" ");

            }

            return Arrays.equals(s3 , s4);
        }
    }
}
