package org.example.Class_11_1_25_collectionFinalfinish;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ///* Write a method countCommon that takes two Lists of integers as parameters
        // * and returns the number of unique integers that occur in both lists. Use one
        // * or more Sets as storage to help you solve this problem.
        // */

        List<Integer> l1 = List.of(1,1,4,3,5);
        List<Integer> l2 = List.of(1,3,5,6);

        System.out.println(countCommon(l1, l2));

    }

    public static int countCommon(List<Integer> list1, List<Integer> list2) {

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        int unique = 0;

        for (int num : set2) {
            if (set1.contains(num)) {
                unique++;
            }
        }
        return unique;
    }
}
