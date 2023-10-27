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
        if (number==1) System.out.println(n1 +" ");
        if (number == 2) System.out.println(n2 +" ");
        if (number>2) System.out.print(n1 +" ");
        while (number < 0) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            number++;
        }
    }
    public static void main(String[] args) {
        int n = 12;
        fib(n);
        System.out.println();
        for (int i = 1; i < 12; i++) {
            System.out.print(fibonacci(i)+ " "); //
        }
    }
}
