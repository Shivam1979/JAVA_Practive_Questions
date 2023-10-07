package Numbers;

import java.util.Scanner;

public class Factor {

    static void fact(int n) {
        int sumFact = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
               sumFact += i;
            }
        }
        System.out.println(sumFact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);

    }
}
