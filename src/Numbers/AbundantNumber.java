package Numbers;

public class AbundantNumber {
    public static void main(String[] args) {
            int num = 18;
            int bag = 0;
            for (int i = 1; i <=num/2; i++) {
                if (num%i==0){
                    bag = bag + i;
                }
            }
            if (bag>num){
                System.out.println(num +" is a abundant number");
            }else System.out.println(num+" is not a abundant number");
        }

}
