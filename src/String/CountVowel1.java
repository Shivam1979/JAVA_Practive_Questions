package String;

public class CountVowel1 {
    public static void main(String[] args) {
        String str = "ShivamSingh";
        String s = str.toLowerCase();
        String count = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' == s.charAt(i) || 'e' == s.charAt(i) || 'i' == s.charAt(i) || 'o' == s.charAt(i) || 'u' == s.charAt(i)) {

            } else count = count + s.charAt(i);
        }
        System.out.println(count);
    }
}
