package String;

public class ReverseStr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("shivam");

        String bb = "";
//        System.out.println(sb.length()-1);
        for (int i = sb.length()-1; i >= 0; i--) {
            bb = bb + sb.charAt(i);
        }
        System.out.println("Reversed String  : "+bb);
        System.out.println("Original String  : "+sb);


    }
}
