package String;
//*60. How would you find all of the substrings of a string?
public class Substring {
    public static void main(String[] args) {
        String  str =  "prachi";

        System.out.println(str.substring(4,4));
        for (int i = 0; i <str.length(); i++) {
            for (int j = i; j <=str.length() ; j++) {
                if (i!=j){
                    System.out.println(str.substring(i,j));
                }
            }
        }

    }
}
