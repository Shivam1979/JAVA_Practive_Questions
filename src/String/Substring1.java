package String;

public class Substring1 {
//*140. How would you find all of the substrings of a string?* 🔍📝

    public static void main(String[] args) {
        String str = new String("Shivam");
        int cout = 0;
        for (int i = 0; i <str.length(); i++) {
            for (int j = i; j <=str.length() ; j++) {
                if (i!=j){
                    System.out.println(str.substring(i,j));
                    cout++;
                }
            }
        }
        System.out.println(cout);
    }
}
