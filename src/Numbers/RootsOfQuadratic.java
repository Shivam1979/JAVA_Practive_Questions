package Numbers;

/**
 * 3. *Program to Find Roots of a Quadratic Equation*
 * - *Input:* coefficients a, b, c (e.g., a=2, b=5, c=2)
 * - *Output:* Roots (if real) or a message indicating no real roots
 */
public class RootsOfQuadratic {
    public static void main(String[] args) {
        //first we find the descriminant// d = b*b - 4a*c
        int a = 5;
        int b = -3, c = -10;
        root(a, b, c);
    }

    static void root(int a, int b, int c) {
        if (a == 0) {
            System.out.println("invalid number");
            return;
        }
        int d = b * b - 4 * a * c;
        double squart = Math.sqrt(Math.abs(d));
        System.out.println(d);

        if (d > 0) {
            System.out.println("Roots are real and diffrent ");
            double root1 = (double) (-b + squart) / (2 * a);
            double root2 = (double) (-b - squart) / (2 * a);
            System.out.println(root1 + "\n" + root2);
        } else if (d == 0) {
            System.out.println("Both are ral and same ");
            double root1 = -(double) b / (2 * a);
            double root2 = -(double) b / (2 * a);
            System.out.println(root1 + "\n" + root2);
        } else if (d < 0) {
            System.out.println("Roots are complex");
            System.out.println(-(double) b / (2 * a) + " + i" + squart + "\n" + -(double) b / (2 * a) + " - i" + squart);
        }
    }
}
