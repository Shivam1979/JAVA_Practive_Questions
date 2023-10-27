package Numbers;

public class Fibb {
    static int fib(int n) {
//        System.out.println(fib(n));
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    static void fibb(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 0; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
        }
    }
    public static void main(String[] args) {
        int count = 8;
        System.out.println(fib(count)); //Method 1
        fibb(count); // Method 2
    }
}
