package org.example.Class_21_1_25_exceptionHandling;

public class Main {
    public static void main(String[] args) throws DataNotFoundException, EmptyLinkedListException {
        LinkedList linkedList = new LinkedList();
        try {
            linkedList.remove((Integer) 1);  // Integer taki saaf saaf pata chale ki we are executing // InvalidIndexException
            System.out.println("Hi");
        }
        catch (DataNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch (EmptyLinkedListException ex){
            System.out.println(ex.getMessage());
        }
        catch (Exception ex){
            throw new InternalServerIssueException(ex.getMessage(), ex);
        }


        linkedList.add(1);
        linkedList.add(2);

        // here compiler knows that the remove function throws Exception
        // thus it's asking you to handle it

        // 1. don't handle
        // 2. handle

        //// IMP:-
        // 1. Understand where you need to throw Exception
        // 2. Understand what exception you need to throw
        // 3.  Understand which exception you need to handle and which you should not





    }
}
