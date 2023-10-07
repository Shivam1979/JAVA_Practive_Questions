package Numbers;

public class Factorial3 {
    public static void main(String[] args) {
        int n = 5;
        int ans = factNum(n);
        System.out.println("Normal method :: "+ans);
        int ans1 = factRec(n);
        System.out.println("By recursion  :: "+ans1);
    }

    static int factNum(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
    static int factRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else return n * factRec(n - 1);
    }
}
