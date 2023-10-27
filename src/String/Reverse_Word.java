package String;

public class Reverse_Word {
    public static String reverseWord(String str) {
        String[] words = str.split("\\s");
        String str1 = "";
        for (int i = words.length - 1; i >= 0; i--) {
            str1 = str1 + words[i] + " ";
        }
        return str1;
    }
    public static void main(String[] args) {
        String str = "Prachi Ayushi Shivam Tanu";
        System.out.println(reverseWord(str));
    }
}
