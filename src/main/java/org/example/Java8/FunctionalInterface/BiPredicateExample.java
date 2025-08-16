package org.example.Java8.FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        // in BiPredicate both inputs can be either same or of different data types
        BiPredicate<String, Integer> isMatch = (x,y) -> x.length() == y;
        System.out.println(isMatch.test("Hello", 5));
        System.out.println(isMatch.test("Helloo", 5));
    }
}
