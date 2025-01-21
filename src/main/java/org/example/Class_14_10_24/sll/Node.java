package org.example.Class_14_10_24.sll;

public class Node {

    private int data;

    private Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node getNext(){
        return this.next;
    }

    int getData(){
        return this.data;
    }


}
