package Numbers;
public class CompoundIntrest {
    public static void main(String[] args) {
/**
 * As we know amount A = P(1+r/100) power T
 * where A is Amount
 * P is principle or starting amount
 * r is a rate of intrest
 * T is the time
 *
 * For the CI = A-P;
 * CI = P(1+r/100) power T - P;
 */
        double P = 1000; // rs
        double T = 2; // year
        double r = 10;
        double CI = P * (Math.pow((1 + (r/100)) ,T)) - P;
        System.out.println(CI);
    }
}
