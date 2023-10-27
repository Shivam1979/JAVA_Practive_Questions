package Exception;

/**
 * 314. *Throwing Custom Exceptions:* 🚨 Implement a method that throws a custom exception if a specific condition is not met.
 * - 🎲 *Input:*
 * - Value: -5
 * - 🎯 *Output:* CustomException: Value must be positive.
 */
 class ShivamException extends Exception {
    ShivamException(String msg) {
        System.out.println(msg);
    }
}
public class CustomException {
    public static void main(String[] args) {
        try {
            checkValue(12);
            checkValue(-5);
        }catch (Exception e){
//            System.out.println(e);
        }
    }
    static void checkValue(int a) throws ShivamException {
        if (a < 0) {
            throw new ShivamException("Value must be positive");
        } else System.out.println("Correct value ... we are processing your request");
    }
}
