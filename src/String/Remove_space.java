package String;

public class Remove_space { // Remove white space
    public static void main(String[] args) {
        String str = "Shiv am Singh";
        String s = str.toLowerCase();
        String count = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i) == ' ') {

            } else count = count + s.charAt(i);
        }
        System.out.println(count);
    }
}