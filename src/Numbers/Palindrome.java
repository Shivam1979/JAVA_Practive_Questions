package Numbers;
////29. Check if a number is Palindrome.
public class Palindrome {
    public static void main(String[] args) {
        int n = 1221;
        int a = n;
        int sum = 0, b = 0;
        while (n > 0) {
            b = n % 10;
            sum = (sum *10 )+ b;
            n = n/10;
        }
        if (a==sum){
            System.out.println("Paindrome number");
        }else System.out.println("Not a Palindrome");

    }
}
