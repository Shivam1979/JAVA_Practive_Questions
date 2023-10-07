package Numbers;

public class Fact_recu {
static int sum =1;
    static  int  fact(int n ){
        if (n == 0){
            return 1;
        }else return n *  fact(n-1);
    }



    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
      //  fact(n);
     /*   int sum = 1;
        while (n > 0) {
            sum = sum * n;
            n = n - 1;
        }

        System.out.println(sum);*/

    }
}
