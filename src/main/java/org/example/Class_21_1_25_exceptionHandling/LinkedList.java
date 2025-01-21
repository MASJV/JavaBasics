package org.example.Class_21_1_25_exceptionHandling;

public class LinkedList {
    private ListNode head;

    public LinkedList(){
        head = null;
    }

    public void add(int data){

    }

    public void insert(int data, int index){
        //InvalidIndexException
    }

    //throws just to declare what are the exceptions a method can throw(throw nahi karega declare hai)
    //throw is the keyword that actually throws an exception

    // checked and unchecked Exception
    // checked exception means compiler is aware of the exception
    // unchecked exception means no declaration or handling is necessary(runtimeException ko extend karna)

    public void remove(Integer data) throws DataNotFoundException, EmptyLinkedListException{
        //Integer so that same na ho jaay (overload ho)
        // head can be null, we should throw InvalidLinkedListException
        // data might not exist, we should throw DataNotFoundException

        //upar throws as extends Exception in DataNotFoundException class

        if(head ==  null){
            throw new EmptyLinkedListException("head is null");
        }

        ListNode temp = head;
        while(temp != null){
            if(temp.data == data){
                //found it
            }
            temp = temp.next;
        }
        throw new DataNotFoundException("data not found");
    }

    public void remove(int index){
        //InvalidLinkedListException (head can be null)
        //InvalidIndexException
    }
}
