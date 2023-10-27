package Numbers;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        perfectNumber(num);
    }
    static void perfectNumber(int num) {
        int bag = 0;
        for (int i = 1; i < num / 2; i++) {
            if (num % i == 0) {
                bag = bag + i;
            }
        }
        if (bag == num) {
            System.out.println(num + " is perfect number ");
        } else System.out.println(num + " is not a perfect number ");
    }
}
