package org.example.Java8.FunctionalInterface;

import java.util.function.Predicate;

public class IsEvenString implements Predicate<String> {

    @Override
    public boolean test(String t) {
        return t.length() % 2 == 0;
    }
}
