package String;

public class RemoveConsAlpha {
    public static void main(String[] args) {


        String st = "ayushi& shivam* prachi$% ta#$nu";
        //v = 5
        //c = 7
        //num = 4
        // spe = 2
        // space = 3
        String str = st.toLowerCase(); //
        String s = "";
        int vowel = 0, number = 0, cons = 0, special = 0, space = 0;


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            } else if (c >= 'a' && c <= 'z') {
                cons++;
            } else if (c == ' ') {
                space++;
            } else if (c >= '0' && c <= '9') {
                number++;
            } else {
                special++;
            }

        }
        System.out.println(vowel);
        System.out.println(cons);
        System.out.println(number);
        System.out.println(special);
        System.out.println(space);
    }

}
