package Numbers;

public class GCD {
    public static int gcdNum(int a, int b) {
        if (a == b)
            return a;

        if (a == 0)
            return b;

        if (b == 0)
            return a;

        if (a > b)
            return gcdNum(a - b, b);
        else return gcdNum(a, b - a);

    }

    public static void main(String[] args) {
        int a = 18, b = 36;

        int aa = gcdNum(a ,b);
        System.out.println(aa);

    }
}
