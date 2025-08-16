package org.example.Java8.FunctionalInterface;

import java.util.function.BiPredicate;

public class isPair implements BiPredicate<String, Integer> {

    @Override
    public boolean test(String s, Integer i) {
        return s.length() == i;
    }
}
