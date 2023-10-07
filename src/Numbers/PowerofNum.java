package Numbers;
//*162. ✨ Calculate the power of a number from 1 to 10 🚀*
public class PowerofNum {
    public static void main(String[] args) {
        int power = 2;
        int start = 1;
        int end = 10;
        for (int i = start; i <=end ; i++) {
            System.out.println("The power of number "+ i+" is "+Math.pow(i,power));
        }
    }
}
