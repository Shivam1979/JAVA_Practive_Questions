package Arrays;
import java.util.Scanner;
public class NumToString {

    static String numtoStr(int num) {
        String str = "";
        while (num > 0) {
            int b = num % 10;
            str = str + b;
            num = num / 10;
        }
        System.out.print("Is the given output is String : ");
        System.out.println(str instanceof String);
        return str;
    }







    public static void main(String[] args) {
        System.out.println("Enter a number that you want to change into String");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(numtoStr(num));
    }
}
