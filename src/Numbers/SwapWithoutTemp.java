package Numbers;

public class SwapWithoutTemp {

// 81. Swap the two numbers without using temporary
// variable , by +- and * / both
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        // swap
        a = a+b; //  a = 10 + 5 = 15
        b = a-b; //  b = 15 -5 = 10
        a = a-b; // a = 15 - 10 = 5
        System.out.println(a);
        System.out.println(b);
        int c = 10;
        int d = 5;
        // swap
        c = c*d; //  c = 10 * 5 = 50
        d = c/d; //  d = 50 / 5 = 10
        c = c/d; // c = 50 / 10 = 5
        System.out.println(a);
        System.out.println(d);



    }
}
