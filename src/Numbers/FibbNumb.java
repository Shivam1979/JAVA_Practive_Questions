package Numbers;
public class FibbNumb {
    public static int fibonacci(int number) { // with recursion
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    static void fib(int number) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int count = 0;
        while (count < number) {
            System.out.println(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            count++;
        }
    }
    public static void main(String[] args) {
        int n = 12;
        fib(n);
        System.out.println();
        for (int i = 1; i < 12; i++) {
            System.out.println(fibonacci(i)); //
        }
    }
}
