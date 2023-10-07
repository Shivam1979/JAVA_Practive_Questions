package Numbers;
//*65. Reverse a number*
public class Reverse {
    public static void main(String[] args) {
        int n = 10111;
        int copy = n;
        int rev = 0;
        while (n > 0) {
            int b = n % 10;
            rev = (rev * 10) + b;
            n = n /10;
        }
        System.out.println("Reverse of number "+copy+" is :"+rev);
    }
}
