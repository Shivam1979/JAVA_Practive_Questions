package String;

public class CheckOnlyDigit {
    static boolean checkDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String str = "9302213653";
        String str1 = "93IND56513";

        System.out.println(str+": "+checkDigit(str));
        System.out.println(str1+": "+checkDigit(str1));
    }
}
