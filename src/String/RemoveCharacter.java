package String;

/**
 * 283. *How do you remove a given character from String?* 🧹
 * *Input Case:*
 * String: "programming"
 * Character to remove: 'm'
 * *Output Case:*
 * String after removal: "prograing"
 */

public class RemoveCharacter {


    static String removeChar2(String str, char rem) {
        String bag = str.replaceAll(Character.toString(rem), "");
        return bag;
    }
    static String removeChar(String str, char rem) {
        String bag = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != rem) {
                bag = bag + str.charAt(i);
            }
        }
        return bag;
    }
    public static void main(String[] args) {
        String str = "programming";
        char rem = 'm';
        System.out.println("By method 1 : "+removeChar(str, rem));
        System.out.println("By method 2 :"+removeChar2(str, rem));
    }
}
