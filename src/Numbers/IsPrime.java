package Numbers;

//1) prime number


public class IsPrime {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }

        if (count == 0){
            System.out.println(n + "  is  prime ");
        }else System.out.println(n +" is not  prime ");
    }
}
