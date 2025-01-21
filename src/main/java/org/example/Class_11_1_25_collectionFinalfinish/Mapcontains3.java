package org.example.Class_11_1_25_collectionFinalfinish;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapcontains3 {
    public static void main(String[] args) {
        /* Write a method contains3 that accepts a List of strings as a parameter and
         * returns true if any single string occurs at least 3 times in the list, and
         * false otherwise. Use a map as auxiliary storage.
         */

        List<String> stringList1 = List.of("Boy", "Cat", "Dog", "Mat", "Boy", "Boy");
        List<String> stringList2 = List.of("Boy", "Cat", "Dog", "Mat", "Boy", "Dog");

        System.out.println(contains3(stringList1));
        System.out.println(contains3(stringList2));
    }
    public static boolean contains3(List<String> strings){
        Map<String, Integer> mapCount = new HashMap<>();

        for(String str : strings){
            mapCount.put(str, mapCount.getOrDefault(str,0) + 1);

            if(mapCount.get(str) >= 3){
                return true;
            }
        }
        return false;
    }

}
