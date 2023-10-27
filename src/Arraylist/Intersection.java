package Arraylist;

import java.util.ArrayList;

/**
 * 319. Find the Intersection of Two ArrayLists: 🔗
 *    - 🎲 Input:
 *      - List 1: [1, 2, 3, 4, 5]
 *      - List 2: [3, 4, 5, 6, 7]
 *    - 🎯 Output:
 *      - Intersection: [3, 4, 5]
 */
public class Intersection {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        ArrayList a2 = new ArrayList();
        a2.add(3);
        a2.add(4);
        a2.add(5);
        a2.add(6);
        a2.add(7);
        ArrayList inter =  new ArrayList();
        for (Object ele: a1) {
            if (a2.contains(ele)){
                inter.add(ele);
            }
        }
        System.out.println(inter);
    }
}
