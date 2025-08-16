package org.example.Map_hw;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsProgramming {
    public static void main(String[] args) {
        Map<String, Map<String, Double>> personRatings = Map.of(
                "Colton", Map.of("kong tofu", 3.5, "little thai", 4.9, "jack in the box", 0.0),
                "Arkita", Map.of("chilis", 2.1, "pho shizzle", 3.3),
                "Ayush", Map.of("sushi burrito", 3.4, "aladdin's", 3.9),
                "Claire", Map.of()
        );
        System.out.println(aveRestaurants(personRatings, 3.5));
    }

    public static Map<String, Set<String>> aveRestaurants(Map<String, Map<String, Double>> peopleRating,
                                                         double targetRating){

            Map<String,Set<String>> result = new TreeMap<>();
            // no Set<String>>?
            // how to add for simple string?(only one restaurant comes?)

            for(String person : peopleRating.keySet()){
                Set<String> restaurants = new HashSet<>();
                for(String restaurant : peopleRating.get(person).keySet()){
                    if(peopleRating.get(person).get(restaurant) >= targetRating){
                        restaurants.add(restaurant);
                    }// how to add for empty list as well
                }
                result.put(person, restaurants);
                // how to print each on new line?
            }
            return result;
    }
}
