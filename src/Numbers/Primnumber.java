package Numbers;

public class Primnumber {

    static void isPrime(int s, int n) {
        for (int i = s; i < n; i++) {
            int coun = 0;
            for (int j = 2; j < n / 2; j++) {
                if (i != j) {
                    if (i % j == 0) {
                        coun++;
                    }
                }
            }
            if (coun >= 1) {
                //System.out.println(i + " is Not prime");
            } else System.out.println(i + " is Prime ");
        }
    }


    public static void main(String[] args) {

        isPrime(0, 100);
    }

}



