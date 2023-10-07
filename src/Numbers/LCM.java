package Numbers;


import java.util.ArrayList;

interface  a{

}
interface  b{

}
interface c extends  a , b{

}
public class LCM {


    public static void main(String[] args) { // by programmiz
        int n1 = 15 ,  n2 = 25;

        int lcm = (n1 < n2)  ? n1 : n2;

        while (true){

            if (lcm % n1 == 0 && lcm % n2 == 0){
                System.out.printf("The lcm of %d and %d is %d" , n1 , n2 , lcm);
                break;
            }
            lcm++;

        }
    }
}
