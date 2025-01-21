package org.example.Class_11_1_25_collectionFinalfinish;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapmaxOccurrences {
    public static void main(String[] args) {
        /* Write a method maxOccurrences that accepts a List of integers as a
         * parameter and returns the number of times the most frequently occurring
         * integer (the "mode") occurs in the list. Solve this problem using a Map as
         * auxiliary storage. If the list is empty, return 0.
         */

        List<Integer> list1 = List.of(1,2,2,3,4,5,5,5);
        System.out.println(maxOccurrences(list1));
    }
    public static int maxOccurrences(List<Integer> numbers){
        Map<Integer, Integer> mapCount = new HashMap<>();

        for(int num : numbers){
            mapCount.put(num, mapCount.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        for(int count : mapCount.values()){
            if(count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
}
