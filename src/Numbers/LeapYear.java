package Numbers;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        leapYear(year);
    }
    static void leapYear(int n) {
        if (n % 400 == 0) {
            System.out.println(n + " is a Leap year");
        } else if (n % 4 == 0 && n % 100 != 0) {
            System.out.println(n + " is a leap year ");
        }
    }
}
