package org.example.Java8.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<String> isEvenString = x-> x.length() % 2 == 0;
        Predicate<String> isEvenString1 = new IsEvenString();
        System.out.println(isEvenString.test("efg"));
        System.out.println(isEvenString1.test("abcd"));
    }
}
