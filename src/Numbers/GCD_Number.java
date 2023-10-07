package Numbers;

//22. Java Program to Find GCD of two Numbers
public class GCD_Number {

    static int gcd(int a, int b) {
        if (a == 0) { // if the value of a is 0 then we return the value of b
            return b;
        }
        if (b == 0) {// if the value of b is 0 then we return the value of a
            return a;
        }
        if (a == b) {// if the value of a  or b is equal then we return any of them
            return a;
        }
        if (a > b) { // if a is greater than b , then we subtract b until a will be greater than of 0;
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }

    public static void main(String[] args) {
        //GCD : Greatest common divisior , means the smallest number that can divide both of the number
        int a = 20, b = 60;
        int sol = gcd(b,a);
        System.out.println(sol);
    }
}
