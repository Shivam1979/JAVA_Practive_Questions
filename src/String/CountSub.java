package String;

public class CountSub {
    static int CountSub(String str) {
        int totalSub = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                if (i!=j){
                    System.out.println(str.substring(i, j));
                    totalSub++;
                }
            }
        }
        return totalSub;
    }
    public static void main(String[] args) {
        String str = "CoreJava";
//        String  str = "Tanu";
        System.out.println("Total SubString of String :" + CountSub(str));
    }
}
