package Numbers;

public class GCDNum {
    //221. *Calculate the greatest common divisor (GCD) of two numbers:* 🧮
    public static void main(String[] args) {
        int n = 60;
        int n2 = 36;
        System.out.println(Gcd(18, 12));
    }
    static int Gcd(int a, int b) { //TimeComplexity =
       if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == b) {
            return b;
        }
        if (a > b) {
            return Gcd(a - b, b);
        } else return Gcd(a, b - a);
    }
}
