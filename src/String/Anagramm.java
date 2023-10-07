package String;


import java.util.Arrays;

public class Anagramm {

    public static void main(String[] args) {
        String s1 = "shivam";
        String s2 = "vamshi";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a,b)){
            System.out.println(" Both String are Anagram String");
        }else    System.out.println(" Both String are not Anagram");
    }
}
