package Numbers;

/**
 * 1. *Replace all 0s with 1s in a given integer*
 *    - *Input:* 10204
 *    - *Output:* 11214
 */
public class ReplaceAll0by1 {
    public static void main(String[] args) {
        int n = 10204;
int ans = 0,temp = 1;
        while (n>0){

            int b = n%10;
            n = n/10;
            if (b==0){
                b =1;
            }
//            System.out.println("b"+b);
            ans = (b * temp) + ans;
            temp = temp *10;
        }
        System.out.println(ans);
    }
}
