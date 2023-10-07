package String;
//*61. Replace all 0’s with 1 in a given integer using Java*
public class Replace1sBy0s {
    public static void main(String[] args) {
        int s =  566004115;
        String ss = Integer.toString(s);
        String n = "";

        for (int i = 0; i < ss.length() ; i++) {
            if (ss.charAt(i)=='0'){
                n = n + 'A';
            }else n = n + ss.charAt(i);
        }
        System.out.println(n);
    }
}
