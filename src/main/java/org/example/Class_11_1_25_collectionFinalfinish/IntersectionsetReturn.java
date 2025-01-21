package org.example.Class_11_1_25_collectionFinalfinish;

import java.util.HashSet;
import java.util.Set;

public class IntersectionsetReturn {
    public static void main(String[] args) {
        // intersection of two Sets and returned a Set

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(5);

        Set<Integer> setB = new HashSet<>();
        setB.add(1);
        setB.add(3);
        setB.add(4);
        setB.add(6);

        System.out.println(intersection(setA, setB));
    }
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}
