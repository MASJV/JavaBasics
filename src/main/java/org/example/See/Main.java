package org.example.See;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create two lists: ArrayList and LinkedList
        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new LinkedList<>();

        // Add elements to both lists
        Methods.addElement(integerList1, 1);
        Methods.addElement(integerList1, 2);
        Methods.addElement(integerList2, 3);
        Methods.addElement(integerList2, 4);

        // Display both lists
        Methods.displayList(integerList1);
        Methods.displayList(integerList2);

        // Remove an element from integerList1 and integerList2
        Methods.removeElement(integerList1, 1);
        Methods.removeElement(integerList2, 3);
        Methods.displayList(integerList1);
        Methods.displayList(integerList2);

        // Add a list of elements at the end of both lists
        List<Integer> newElements = List.of(5, 6, 7);
        Methods.addListAtEnd(integerList1, newElements);
        Methods.addListAtEnd(integerList2, newElements);
        Methods.displayList(integerList1);
        Methods.displayList(integerList2);

        // Add a list of elements at a specific index for both lists
        Methods.addListAtIndex(integerList1, List.of(8, 9), 1);
        Methods.addListAtIndex(integerList2, List.of(10, 11), 2);
        Methods.displayList(integerList1);
        Methods.displayList(integerList2);

        // Search for an element in both lists
        System.out.println("Search in List1: " + Methods.searchElement(integerList1, 5));
        System.out.println("Search in List2: " + Methods.searchElement(integerList2, 10));

        // Remove a list of elements from both lists
        Methods.removeList(integerList1, List.of(6, 7));
        Methods.removeList(integerList2, List.of(4, 5));
        Methods.displayList(integerList1);
        Methods.displayList(integerList2);

        // Size and isEmpty for both lists
        System.out.println("List1 Size: " + Methods.getSize(integerList1));
        System.out.println("List2 Size: " + Methods.getSize(integerList2));
        System.out.println("Is List1 Empty: " + Methods.isEmpty(integerList1));
        System.out.println("Is List2 Empty: " + Methods.isEmpty(integerList2));
    }
}
