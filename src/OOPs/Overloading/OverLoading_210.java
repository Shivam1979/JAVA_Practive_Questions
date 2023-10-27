package OOPs.Overloading;

/**
 * 210. *Method Overloading:* 🔄 Create a class "Calculator" with overloaded methods for addition.
 * These methods should allow adding two integers, two doubles, and an integer and a double.
 * Demonstrate how method overloading works. ➕🔄
 */

class Calculator {
    double sum(int a, int b) {
        return a + b;
    }
    double sum(int a, int b, int c) {
        return a + b + c;
    }
    double sum(float a, float b, int c) {
        return a + b + c;
    }
}
public class OverLoading_210 {
    static Calculator c = new Calculator();
    public static void main(String[] args) {
        System.out.println(c.sum(34, 4));
        System.out.println(c.sum(5.0f, 5, 56));
        System.out.println(c.sum(45, 56, 89));

    }

}
