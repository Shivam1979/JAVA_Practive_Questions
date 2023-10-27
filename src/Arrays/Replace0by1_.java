package Arrays;

public class Replace0by1_ {
    public static void main(String[] args) {
        int num = 706120678, rem, k = 1;
        int replacenum = 0;
        while (num != 0) {
            rem = num % 10;
            if (rem == 0) {
                rem = 1;
            }
            replacenum = replacenum + rem * k;
            num = num / 10;
            k = k * 10;
        }
        System.out.println(replacenum);
    }

}
