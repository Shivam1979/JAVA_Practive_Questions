package String;

public class Double_ee {


    static String ee(String str) {

        String neww = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'e') {
                neww = neww + "ee";
            } else {
                neww = neww + str.charAt(i);
            }
        }
        return neww;
    }
    public static void main(String[] args) {
        String str = "Hello everyone";
        System.out.println(ee(str));
    }
}
