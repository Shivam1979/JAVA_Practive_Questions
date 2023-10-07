package Numbers;

//4) sum of digits and palindrome number/ string
public class SumDigit {
    static int sumDigit(int n) {
        int sum = 0;
        while (n >= 1) {
            int m = n % 10;
            sum = sum + m;
            n = n / 10;
        }
        return sum;
    }
    static String palindromeNum(int n) {
        int rev = 0;
        while (n >= 1) {
            int m = n % 10;
            rev = (rev * 10) + m;
            n = n / 10;
        }
        if (rev == n) {
            return " is palindrome";
        } else return " not a palindrome";
    }
    static void PalindromeStr(String f) {
        String s = "naman";
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        if (r.equals(s)) {
            System.out.println(r + "is  Palindrome ");
        } else
            System.out.println(r + " is not a palindrome ");
    }
    public static void main(String[] args) {
        int n = 564;
        System.out.println("The Sum of " + n + " digit is " + sumDigit(n));
        System.out.println(n + palindromeNum(n));
        PalindromeStr("");
    }
}
