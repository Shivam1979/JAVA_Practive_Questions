package String;

public class Substring2 {

    static void subString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                if (i != j) {
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }

    public static void main(String[] args) {
        String s = "listen";
        subString(s);
    }
}
