package org.example.Problems_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(copyStack(stack));   //non static bina object invoke nahi hoga
        // static member, class ki property he object ki nahi
    }

    public static Stack<Integer> copyStack(Stack<Integer> original){  //or void and print(newStack)
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> newStack = new Stack<>();

        while(!original.isEmpty()){
            queue.offer(original.pop());
        }

        while(!queue.isEmpty()){
            int val = queue.poll();
            newStack.push(val);
        }

        while(!newStack.isEmpty()){
            queue.offer(newStack.pop());
        }

        while(!queue.isEmpty()){
            int val = queue.poll();
            newStack.push(val);
            original.push(val);
        }

        return newStack;
    }

    public void stackToQueue(Stack<Integer> original){

    }
}
