package org.example.Map_hw;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Studentstaughthw {
    public static void main(String[] args) {
        Map<String, Map<Integer, String>> enrollmentHistory = Map.of(
                "Colton", Map.of(163, "Kevin"),
                "Darel", Map.of(416, "Hunter", 373, "Kevin", 143, "Kevin"),
                "Ben", Map.of(373, "Kevin", 143, "Stuart"),
                "Atharva", Map.of(121, "Miya", 122, "Hunter", 123, "Brett")
        );
        System.out.println(studentsTaught(enrollmentHistory, "Kevin"));
        System.out.println(studentsTaught(enrollmentHistory, "Elba"));
    }

    public static Set<String> studentsTaught(Map<String, Map<Integer, String>> studentTaught,
                                             String instructor){

        Set<String> students = new TreeSet<>();

        for(String student : studentTaught.keySet()){
            for(String teacher : studentTaught.get(student).values()){
                if(teacher.equals(instructor)){
                    students.add(student);
                    break;
                }
            }
        }
        return students;
    }
}
