package org.example.Class_23_11_24_interface_list;

import java.util.List;

public class Methods {

    public static void addElement(List<Integer> list, Integer element){
        list.add(element);
    }

    public static void removeElement(List<Integer> list, Integer element){
        list.remove(element);
    }

    public static void displayList(List<Integer> list){
        System.out.println(list);
    }
}
