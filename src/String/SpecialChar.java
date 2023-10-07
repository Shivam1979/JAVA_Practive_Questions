package String;

public class SpecialChar {

//2. Write a program to count special characters in a string
    public static void main(String[] args) { // by gfg
        String str = "1234675&^%dFD";
        int special = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))
                    && !Character.isAlphabetic(str.charAt(i))) {
                special++;
                System.out.println(str.charAt(i));
            }
        }
        System.out.println(special);
    }
}
