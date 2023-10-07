package Numbers;

public class Palindrome1 {

    public static void main(String[] args) {
        int a = 121;
        int copy = a;
        int rev = 0;
        while (a > 0) {
            int b = a % 10;
            rev = (rev * 10) + b;
            a = a / 10;
        }
        if (copy == rev){
            System.out.println(copy+" is palindrome ");
        }else System.out.println(copy + " is not palindrome");
    }
}
