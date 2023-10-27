package String;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

public class Anagram2 {
    public static void main(String[] args) {
        Hashtable<Integer,String> h=new Hashtable<>(16);
        h.put(1,"aff");
        h.put(2,"aff");h.put(3,"aff");h.put(4,"aff");h.put(4,"aff");h.put(1,"aff");h.put(1,"aff");
        h.put(1,"aff");h.put(1,"aff");h.put(1,"aff");
        System.out.println(h);
        Enumeration e=h.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}