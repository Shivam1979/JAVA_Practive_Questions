package String;

public class SpecialCharacter {
    public static void main(String[] args) {
        String str = "Shivam  *&^% Singh";
        System.out.println(countSpecial(str));
    }

    static int countSpecial(String str) {
        int countSpecial = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                countSpecial++;
            }

        }
        return countSpecial;
    }
}

