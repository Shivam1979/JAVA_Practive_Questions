package String;

public class RemoveSpace1 {


    static  String method1(String s){
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
            } else {
                n = n + s.charAt(i);
            }
        }
        return  n;
    } static  String method2(String s){
       String nn =  s.replace(" " , "");
       return nn;
    }

    public static void main (String[] args) {
        String s = "TCS CodeVita";
        System.out.println(method1(s));
        System.out.println(method2(s));
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if( (c[i] != ' ') && (c[i]!= '\t' )) {
                sb.append(c[i]);
            }
        }
        System.out.println("String after removing spaces : "+sb);
    }
}
