package String;
//16.  Count  the number of vowels and  number of consonants in a string separately ?
public class Count_vow_consonent {
    public static void main(String[] args) {
        String s = "123BbcC   aeiou";
        String str = s.toLowerCase();
        int vow =0; int cons = 0;
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch == 'a'  || ch == 'e'  ||ch == 'i'  ||ch == 'o'  ||ch == 'u'){
                vow++;
            }else if (ch >= 'A' && ch <= 'Z' || ch >='a' && ch <= 'z'){
                cons++;
            }
        }
        System.out.println("Number of vowel "+vow);
        System.out.println("Number of consonenets "+cons);
    }
}
