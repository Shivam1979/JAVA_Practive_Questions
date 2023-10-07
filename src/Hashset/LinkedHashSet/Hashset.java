package Hashset.LinkedHashSet;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        // Hashset lhs = new Hashset();
        HashSet lhs = new HashSet<>();
        lhs.add(2); // duplicate is not allowed
        lhs.add(2);

        lhs.add(2);
        System.out.println(lhs); //[2]
        lhs.add(5);
        lhs.add(1);
        lhs.add(289);
        System.out.println(lhs); // insertion order is  not  preserved
    }
}
