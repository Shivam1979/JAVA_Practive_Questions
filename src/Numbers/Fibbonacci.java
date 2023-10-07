package Numbers;

public class Fibbonacci {
    static void Fib(int n) {
        int n1 = 0, n2 = 1, n3;

        int count = 0;
        while (count < n) {
            System.out.println(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;  //1
            n2 = n3;  //1
            count++;


        }
    }
    public static void main(String[] args) {
        int n = 10;
        Fib(n);
    }
}
