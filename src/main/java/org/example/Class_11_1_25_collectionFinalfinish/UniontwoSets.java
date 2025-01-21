package org.example.Class_11_1_25_collectionFinalfinish;

import java.util.HashSet;
import java.util.Set;

public class UniontwoSets {
    public static void main(String[] args) {
        // union of two Sets

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(1);

        System.out.println(union(setA, setB));
    }
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }
}
