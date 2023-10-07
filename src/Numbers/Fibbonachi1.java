package Numbers;

public class Fibbonachi1 {
    //15. How do you print a Fibonacci sequence using recursion?
    static int fibbo(int n) { // without recursion
        int n1 = 0, n2 = 1, n3;
        if (n == 0) {
            return n1;
        }
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }
    public static int fibonacci(int number) { // with recursion
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }


    public static void main(String[] args) {
        int n = 45;

        System.out.println(fibonacci(n)+" ");
    }

}
