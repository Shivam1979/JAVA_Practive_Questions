package Numbers;

import Arrays.MaxArray;

/**
 * 338. Check if a Number is a Power of Two:
 * - Input:
 * Number: 16
 * - Output:
 * true
 */
public class CheckPowerOfTwo {
    static void checkPower(int num) {
        int j = 0;
        for (int i = 0; i <=num ; i++) {
            if (num == Math.pow(2,j)){
                System.out.println(num+" is a Power of Two");
                break;
            }
            j++;
        }
//        System.out.println("not a power of two ");
    }

    public static void main(String[] args) {
;
//        System.out.println(checkPower(16));
        checkPower(16);
//        checkPower(14);
    }
}
