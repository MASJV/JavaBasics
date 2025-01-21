package org.example.Class_14_10_24.sll;

public class SingleLinkedList {

    private Node head;

    public SingleLinkedList(){
        head = null;
    }

    public void insertAtBeginning(int data){

    }

    public void insertAtEnd(int data){

    }

    public void insertAtMiddle(int data, int index){

    }

    public void deleteAtBeginning(int data){

    }

    public void deleteAtEnd(int data){

    }

    public void deleteAtMiddle(int data, int index){

    }

    public void size(){

    }

    public void isEmpty(){

    }

    public void display(){
        Node temp = head;
        while(temp.getNext() != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public SingleLinkedList clone(){
        return null;
    }


    class Node {

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

}
