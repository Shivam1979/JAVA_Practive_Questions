package Collection.Arraylist.Vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.function.Consumer;

public class Iterate_value {
    public static void main(String[] args) {
        // as we know vector support all of the iteration ,
        // for each , iterator , ListIterator , Enumeration , Foreach() method


        Vector <String> v = new Vector<>(); // it is a legacy class  the first version of java is 1.0 , and this will also introduced in 1.0 version
        // colection framework introduced in 1.2;
        v.add("Shivam");
        v.add("Ayush");
        v.add("Sahil");
        v.add("Arnav");

        System.out.println(v.capacity());
        System.out.println(v);
//by using foreach
        System.out.println("-------------- foreach-----------------------");

        for (String read : v) {
            System.out.println(read + "\t" + read.length()+ "\t");

        }
//by using  Iterator :Forward transversing
        System.out.println("---------------Iterator-------------------------");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

//By ListIterator , v.size
        System.out.println("----------ListIterator------------------------------");

         ListIterator<String> litr = v.listIterator(v.size());
        while (litr.hasPrevious()){
            String prev = litr.previous();
            System.out.println(prev);
        }
//foreach Method
        System.out.println("---------------foreach Method-------------------------");

        v.forEach(e->{
            System.out.println(e);
        });




    }
}
