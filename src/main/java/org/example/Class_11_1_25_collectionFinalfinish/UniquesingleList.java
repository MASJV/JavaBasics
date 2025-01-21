package org.example.Class_11_1_25_collectionFinalfinish;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniquesingleList {
    public static void main(String[] args) {
        //* Write a method countUnique that takes a List of integers as a parameter and
        // * returns the number of unique integer values in the list. Use a Set as
        // * auxiliary storage to help you solve this problem.
        // */

        List<Integer> l1 = List.of(1,1,3,3,5,6,7,2,7);
        System.out.println(countUnique(l1));

    }
    public static int countUnique(List<Integer> list1){
        Set<Integer> unique = new HashSet<>(list1);
        return unique.size();
    }
}
