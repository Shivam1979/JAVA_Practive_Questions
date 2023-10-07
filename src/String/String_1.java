package String;

public class String_1 {

    public static void main(String[] args) {
        String str = "genuis student";
     /*   Enter a string: genuis student
        hfOvjt tUvEfOU*/
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char a = (char) (ch + 1);
            if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z'){
                s = s+ a;
                if (a == 'a' || a == 'e' || a == 'i' || a == 'o' ||a=='u'){
                   a = (char) (a %26);
                    s = s+ a;
                }
            }
        }
        System.out.println(s);

    }


}
