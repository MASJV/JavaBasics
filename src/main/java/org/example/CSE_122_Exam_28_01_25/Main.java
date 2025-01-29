package org.example.CSE_122_Exam_28_01_25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Set<String>> map = Map.of(
                "Atharva", Set.of("board games", "comedy shows", "hiking", "video gaming"),
                "Chaafen", Set.of("Formula 1", "reading", "traveling", "video gaming"),
                "Jaylyn", Set.of("hiking", "traveling", "video gaming"),
                "Shivani", Set.of("cafes", "music shows")
        );
        System.out.println(mostPopularHobby(map));
    }

    public static String mostPopularHobby(Map<String, Set<String>> taHobbies){
        Map<String, Integer> hobbyFreq = new HashMap<>();

        for (Set<String> hobbies : taHobbies.values()) {
            for (String hobby : hobbies) {
                hobbyFreq.put(hobby, hobbyFreq.getOrDefault(hobby, 0) + 1);
            }
        }

        String mostPopular = null;
        int maxCount = 0;

        for (String hobby : hobbyFreq.keySet()) {
            int count = hobbyFreq.get(hobby);

            if (mostPopular == null) {
                mostPopular = hobby;
                maxCount = count;
            }
            else if (count > maxCount || (count == maxCount && hobby.compareTo(mostPopular) < 0)) {
                mostPopular = hobby;
                maxCount = count;
            }
        }
        return mostPopular;
    }
}
