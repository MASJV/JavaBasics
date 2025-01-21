package org.example.Class_31_12_24;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackAndQueue {


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        //push to stack
        stack.push(1); // push on the top
        stack.push(3);
        stack.push(4);
        stack.push(2);
        // return top
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());


        //Queue
        Deque<Integer> queue = new LinkedList<>();
        //EnQueue Operation
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.add(4);


        //front
        System.out.println(queue.peek());

        //DeQueue
        System.out.println(queue.poll());

        //add at Begining
        queue.addFirst(2);





    }

    /**
     *
     * Create a MyStack class and take  Queue only to perform all the stack operation
     *
     */

}
