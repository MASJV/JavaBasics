package org.example.Problems_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SplitStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(-3);
        stack.push(-10);
        stack.push(4);
        stack.push(-18);
        stack.push(7);

        System.out.println(splitStack(stack));
    }

    public static Stack<Integer> splitStack(Stack<Integer> original){
        Queue<Integer> queue = new LinkedList<>();

        int size = original.size();
        for(int i = 0; i < size; i++){
            int val = original.pop();
            if(val < 0){
                queue.offer(val);
            }
            else{
                original.insertElementAt(val,0);
            }
        }

        while(!queue.isEmpty()){
            original.push(queue.poll());
        }

        return original;
    }
}
