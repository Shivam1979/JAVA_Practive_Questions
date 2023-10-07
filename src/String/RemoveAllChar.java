package String;

public class RemoveAllChar {
    static void alphaAdder(String str ){
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch <= 'z' && ch >= 'a' || ch <= 'Z' && ch >= 'A') {
                temp = temp + str.charAt(i);
            }
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        String str = "S$5h09)i/v,,*a89m";
        String str1 = "t*^76a#$n&^u";
        String str2 = "a76yu9{}s<>hi";
        String str3 = "P^%r>a}{|c{_h%$i";
        alphaAdder(str);
        alphaAdder(str1);
        alphaAdder(str2);
        alphaAdder(str3);

    }

}
