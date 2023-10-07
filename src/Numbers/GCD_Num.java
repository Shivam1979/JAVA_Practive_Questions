package Numbers;

public class GCD_Num {

    public static int GCD(int a, int b) {
        if (a == b)
            return a;

        if (a == 0)
            return b;

        if (b == 0)
            return a;

        if (a > b)
            return GCD(a - b, b);
        else
            return GCD(a, b - a);
    }

    public static void main(String[] args) {
        int a = 18, b = 36;
        System.out.println(GCD(a, b));
    }

}

