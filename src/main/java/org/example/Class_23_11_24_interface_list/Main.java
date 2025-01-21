package org.example.Class_23_11_24_interface_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new LinkedList<>();
        // add at begin, end same for delete
        // add at any index
        // add a list of element at end, at any index
        // search
        //remove a list of element
        //size and isEmpty
        //LOOSE COUPLING and tight coupling and interface

        Methods.addElement(integerList1, 1);
        Methods.addElement(integerList1, 2);
        Methods.addElement(integerList2, 3);

        Methods.displayList(integerList1);
        Methods.displayList(integerList2);

        Methods.removeElement(integerList1, 1);
        Methods.displayList(integerList1);
    }
}
