package org.example.Map_hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mostpopularhobbyhw {
    public static void main(String[] args) {
        Map<String, Set<String>> m = Map.of(
                "Atharva", Set.of("board games", "comedy shows", "hiking", "video gaming"),
                "Chaafen", Set.of("Formula 1", "reading", "traveling", "video gaming"),
                "Jaylyn", Set.of("hiking", "traveling", "video gaming"),
                "Shivani", Set.of("cafes", "music shows")
        );
        System.out.println(mostPopularhobby(m));
    }

    public static String mostPopularhobby(Map<String, Set<String>> taHobbies) {
        Map<String, Integer> hobbyCount = new HashMap<>();

        for (Set<String> hobbies : taHobbies.values()) {
            for (String hobby : hobbies) {
                hobbyCount.put(hobby, hobbyCount.getOrDefault(hobby, 0) + 1);
            }
        }

        String mostPopular = null;
        int maxCount = 0;

        for (String hobby : hobbyCount.keySet()) {
            int count = hobbyCount.get(hobby);

            if (mostPopular == null) {
                mostPopular = hobby;
                maxCount = count;
            } else if (count > maxCount || (count == maxCount && hobby.compareTo(mostPopular) < 0)) {
                mostPopular = hobby;
                maxCount = count;
            }
        }
        return mostPopular;
    }
}
