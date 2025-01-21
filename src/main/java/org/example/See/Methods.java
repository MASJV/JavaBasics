package org.example.See;

import java.util.List;

public class Methods {

    public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public static void displayList(List<Integer> list) {
        System.out.println(list);
    }

    public static void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element)); // Removes the first occurrence of the specified element
    }

    public static void addListAtEnd(List<Integer> list, List<Integer> elements) {
        list.addAll(elements);
    }

    public static void addListAtIndex(List<Integer> list, List<Integer> elements, int index) {
        list.addAll(index, elements);
    }

    public static boolean searchElement(List<Integer> list, int element) {
        return list.contains(element);
    }

    public static void removeList(List<Integer> list, List<Integer> elements) {
        list.removeAll(elements);
    }

    public static int getSize(List<Integer> list) {
        return list.size();
    }

    public static boolean isEmpty(List<Integer> list) {
        return list.isEmpty();
    }
}
