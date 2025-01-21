package org.example.Map_hw;

import java.util.*;

public class Maingeneral {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(14);
        set1.add(11);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(14);
        set2.add(11);

        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(14);
        set3.add(11);

        System.out.println("set1: " + set1); //anything
        System.out.println("set2: " + set2); //[2, 1, 3, 14, 11]
        System.out.println("set3: " + set3); //[1, 2, 3, 11, 14]

        //look up
        System.out.println(set1.contains(14));
        System.out.println(set1.containsAll(List.of(1, 14)));

        set1.remove(14);
        set1.removeAll(List.of(1, 2));

        System.out.println("After removing: " + set1);
        set1.clear();
        System.out.println("After clearing: " + set1);
    }
}
