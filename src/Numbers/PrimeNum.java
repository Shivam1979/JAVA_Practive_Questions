package Numbers;
public class PrimeNum {
    //    *63. Write the prime number from 1 to 10*
    public static void main(String[] args) {
        int n = 10;
        isPrime(n, 0);
    }


    static void isPrime(int n, int s) {
        for (int i = s; i < n; i++) {
            int coun = 0;
            for (int j = 2; j < n; j++) {
               if (i!=j){
                    if (i % j == 0) {
                       System.out.println(i + " " + j);
                        coun++;

                   }
                }
            }
          //  System.out.println("Count :"+coun);
            if (coun >= 1) {
                System.out.println(i + " is Not prime");
            } else System.out.println(i + " is Prime ");
           // System.out.println(coun);
        }
    }
}
