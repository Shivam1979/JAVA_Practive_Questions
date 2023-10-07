package Numbers;

public class GCD1 {

    private static int numGCD(int i, int i1) {
        if (i == 0) return i1;
        if (i1 == 0) return i;
        if (i == i1) return i;
        if (i > i1) return numGCD(i - i1, i1);
        else return numGCD(i, i1 - i);
    }
    public static void main(String[] args) {
        // in this question we need to find the GCD of two number
        int a = 18;
        int b = 36;
        int n = numGCD(a,b);
        System.out.println("GCD of "+a+" "+b+" is "+n);
    }


}
