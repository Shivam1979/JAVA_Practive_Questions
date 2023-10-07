package String;
import java.util.Scanner;
//5) remove all the white space
public class RemoveSpace {
    static String checkSpace(String s) {
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
            } else {
                n = n + s.charAt(i);
            }
        }
         return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = checkSpace(str);
        System.out.println(s);

    }
}
