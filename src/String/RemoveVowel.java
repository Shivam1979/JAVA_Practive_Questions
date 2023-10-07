package String;

public class RemoveVowel {

    //a e i o u
    //a
    //A

    // remove the vowel from a /string
    public static void main(String[] args) {
        String str = "Gaurav tiwari";
        String s = str.toLowerCase(); // prachidubeyindia
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i)<= 122){

            }
           else {
               r = r + s.charAt(i);
            }

        }
        System.out.println(r);
    }
}
