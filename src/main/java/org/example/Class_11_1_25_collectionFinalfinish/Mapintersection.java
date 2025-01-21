package org.example.Class_11_1_25_collectionFinalfinish;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Mapintersection {
    public static void main(String[] args) {
        /* Write a method intersect that takes two Maps of strings to integers as
        * parameters and that returns a new map whose contents are the intersection
        * of the two. The intersection of two maps is defined here as the set of keys
        * and values that exist in both maps. So if some key K maps to value V in
        * both the first and second map, include it in your result. If K does not
        * exist as a key in both maps, or if K does not map to the same value V in
        * both maps, exclude that pair from your result.
         */

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        map1.put("d", 4);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("a", 2);
        map2.put("b", 2);
        map2.put("c", 3);
        map2.put("e", 4);

        System.out.println(System.currentTimeMillis());  //used to get runtime
        System.out.println(intersection(map1, map2));
        System.out.println(System.currentTimeMillis());
    }
    public static Map<String, Integer> intersection(Map<String,Integer> map1,
                                                    Map<String,Integer> map2){

        if(map1.isEmpty() || map2.isEmpty()){
            return Collections.EMPTY_MAP;   /*collection is Interface and
                                              collections is Class
                                            */
        }

        Map<String, Integer> intersectionMap = new HashMap<>();

        for(String key : map1.keySet()){
            if(map2.containsKey(key) && map1.get(key).equals(map2.get(key))){
                intersectionMap.put(key, map1.get(key));
            }
        }

        return intersectionMap;

    }

}
