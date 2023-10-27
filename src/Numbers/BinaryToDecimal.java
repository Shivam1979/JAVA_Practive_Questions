package Numbers;


public class BinaryToDecimal {
    public static void main(String[] args) {
        int bin = 1010;
        int dec = 0;
        int count = 0;
        while (bin>0){
            int n1 = 0;
            int b = bin%10;
            n1 = (int) (b * Math.pow(2,count));
            dec = dec + n1;
            bin = bin/10;
            count++;
        }
        System.out.println(dec);
    }

}
