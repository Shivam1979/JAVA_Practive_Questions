package Numbers;





import java.util.Scanner;

public class PerfectNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = 0;
        int index = 0;
        while (num > 0) {
            int b = num % 10;
            int sum = (int) (b * Math.pow(2, index));
            index++;
            temp = temp + sum;
            num = num / 10;
        }
        System.out.println(temp);

    }

}
