package Numbers;



public class Quiz1 {
  /*  public static void main(String[] args) {
        for (int index = 0; 1; index++) {
            System.out.println("Welcome");
            break;
        }
    }*/

    public static void main(String[] args) {
        int sum = -5;
        try {
            int i;
            sum = 10;
            for (i = -2; i < 3; ++i)
                sum = (sum / i);
        } catch (ArithmeticException e) {
            System.out.print("0");
        }
        System.out.print(sum);
    }


}
