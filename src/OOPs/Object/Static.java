package OOPs.Object;

/**
 *
 209. *Static Methods and Variables:* 🧪 Create a class "MathUtils" with static methods
 for common mathematical operations like addition, subtraction, multiplication,
 and division. Also, include a static variable to keep track of the number of operations
 performed. ➕➖✖➗
 */
class MathUtils{
    static  int countOperation = 0;

    static double addition(int a , int b){
        countOperation++;
        return a+b;
    }
    static  double substraction(int a , int b){
        countOperation++;
        return a-b;
    }
    static double multiplication(int a , int b){
        countOperation++;
        return a*b;
    }
    static double division(int a , int b){
        countOperation++;
        return a/b;
    }
}
public class Static extends MathUtils {
    public static void main(String[] args) {
        System.out.println("Addition       : "+addition(12,23));
        System.out.println("Substraction   : "+substraction(56,45));
        System.out.println("Multiplication : "+multiplication(10,8));
        System.out.println("Division       : "+division(100,5));
        System.out.println("Number of Operaions : "+countOperation);

    }
}
