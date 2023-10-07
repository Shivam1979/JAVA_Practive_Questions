package Hashset.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetIntro {
    //*72. Write the code to implement a HashSet using the Collection framework and perform all operations using methods*
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(23);
        hashSet.add(54);
        hashSet.add(54);
        hashSet.add(0);
        hashSet.add(56);
        System.out.println("HashSet elements: " + hashSet);
        System.out.println();
        hashSet.remove(0);
        System.out.println(hashSet.contains(1));
        System.out.println("HashSet elements: " + hashSet);
        System.out.println(hashSet.size());
        for (Object e:hashSet
             ) {
            System.out.println(e);
        }
        System.out.println("-----------");
        hashSet.forEach(a -> {
            System.out.println(a);
        });

        hashSet.forEach(e->{
            System.out.println(e);
        });
        System.out.println("-------------");
        Iterator itr = hashSet.iterator();
        while (itr.hasNext()){
            int a = (int) itr.next();
            System.out.println(a);
        }
    }
}
