package Numbers;

public class HarshadNumber {

    public static void main(String[] args) {
        // if the the sum of every digit of number is divisble by original number then  it is harshad number ,  ya fr factor ho
        int num = 18;
        int n = num;
        int sum = 0;
        while (n > 0) {
            int b = n % 10;
            sum = sum + b;
            n = n / 10;
        }
        if (num % sum == 0) {
            System.out.println(num+" is harshad number");
        }else System.out.println(num+" not a harshad number");


    }


}
