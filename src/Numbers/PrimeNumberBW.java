package Numbers;

/**
 * . Find Prime Numbers Between Two Given Numbers:
 *    - Input:
 *      Starting Number: 10
 *      Ending Number: 30
 *    - Output:
 *      Prime Numbers between 10 and 30: 11, 13, 17, 19, 23, 29
 */
public class PrimeNumberBW {
    static boolean isPrime(int num) {
        for (int i = 2; i <=num/2 ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 10; i <=30 ; i++) {
            if (isPrime(i)){
                System.out.println(i +" ");
            }
        }
    }

}
