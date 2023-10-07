package String;

public class CountAlpha {
    //*70. Count all the alphabets in String*
    String str = "Shivam13%$#";
    public static void main(String[] args) {
       CountAlpha ob = new CountAlpha();
        int count = 0;
        for (int i = 0; i < ob.str.length(); i++) {
            char ch = ob.str.charAt(i);
            if (ch >= 'A' && ch <= 'Z'||ch >= 'a' && ch <= 'z'  ){
                count++;
            } }
        System.out.println(count);
    } }
