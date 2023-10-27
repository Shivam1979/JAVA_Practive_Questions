package String;

/**
 * 272. *How do you print duplicate characters from a string?*
 * - *Input:* "programming" 🔠
 * - *Output:* "g", "r", "m" 🔡
 */
public class DuplicateChar {
    static void approch1(String str) {
        System.out.println("By Approch 1---->O(n*n)");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
//                System.out.println(i+" "+j);
                if (str.charAt(i) == str.charAt(j))
                    System.out.println(str.charAt(j) + " is Duplicate");
            }
        }
    }
    static void approch2(String str) {
        int i = 0;
         System.out.println("By Approch 2---->O(n)");
        for (int j = i+1 ; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j))
           System.out.println(str.charAt(j) + " is Duplicate");
            if (j == str.length()-1 && i < str.length() - 1) {
                i++;
                j = i;
            }
        }
    }
    public static void main(String[] args) {
        String str = "programming";
        approch1(str);
        approch2(str);
    }
}
