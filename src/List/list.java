package List;

import java.util.*;

public class list {
    public static void main(String[] args) {
        /*List<Integer> l = new ArrayList<>();
//        l.add("Shivam");  we can not store due to geric and  its advantage is type safe
        l.add(150);
        l.add(900);
        l.add(150);
        l.add(10);
        l.add(108);
        System.out.println(l);
        Iterator itr = l.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/

       List <String>l = new ArrayList<>();
        l.add("Shivam");
        l.add("Tanu");
        l.add("Ayushi");
        l.add("Prachi");
      // l.add(90);

        l.add(1,"Susheel");
        l.remove("Prachi");
        l.add("Kishan");
        ListIterator<String> itr = l.listIterator();
        System.out.println("Forward--------------------------------------");
        while (itr.hasNext()){
           System.out.println(itr.next());
        }
        System.out.println("Backward---------------------------------------");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
 //List<String> ll =/* new LinkedList<>();
     /*   ll.add("45");
        ll.add("4");
        ll.add("5");
        ll.add("56");
        ll.add("98");
        System.out.println(ll);
        Iterator itr  = ll.listIterator();

        while (itr.hasNext()){
            System.out.println(itr.next());

*/


}
