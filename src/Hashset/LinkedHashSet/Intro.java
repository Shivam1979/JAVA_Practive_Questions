package Hashset.LinkedHashSet;

import java.util.LinkedHashSet;

public class Intro {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add(2); // duplicate is not allowed
        lhs.add(2);

        lhs.add(2);
        System.out.println(lhs); //[2]
        lhs.add(5);
        lhs.add(1);
        lhs.add(289);
        System.out.println(lhs); // insertion order is preserved

    }
}
