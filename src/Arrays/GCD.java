package Arrays;
/**
 * 284. *Write code of Greatest Common Divisor* 🧮
 * Input Case:*
 * Numbers: 24, 36
 * Output Case:*
 * Greatest Common Divisor: 12
 */
public class GCD {
    public static int method1(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        if (num1 == 0) {
            return num2;
        }
        if (num1 == num2) {
            return num1;
        }
        if (num1 > num2) {
            return method1(num1 - num2, num2);
        } else return method1(num1, num2 - num1);
    }
    public static void method2(int num1, int num2) {
        while (true) {
            if (num2 == 0) {
                System.out.println("GCD : " + num1);
                break;
            }
            if (num1 == 0) {
                System.out.println("GCD : " + num2);
                break;
            }
            if (num1 == num2) {
                System.out.println("GCD : " + num1);
                break;
            }
            if (num1 > num2) {
                num1 = num1 - num2;
            } else num2 = num2 - num1;
        }
    }
    public static void main(String[] args) {
        int num1 = 24, num2 = 36;
        System.out.println("By recursion : "+method1(num1, num2));
        System.out.print("By loop : ");
        method2(num1, num2);
    }
}
