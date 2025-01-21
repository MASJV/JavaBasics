package org.example.Problems_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stutter {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stutter(stack));
    }

    public static Stack<Integer> stutter(Stack<Integer> original){
        Queue<Integer> queue = new LinkedList<>();

        while(!original.isEmpty()){
            int val = original.pop();
            queue.offer(val);
            queue.offer(val);
        }

        while(!queue.isEmpty()){
            original.push(queue.poll());
        }

        while(!original.isEmpty()){
            queue.offer(original.pop());
        }

        while(!queue.isEmpty()){
            original.push(queue.poll());
        }

        return original;

    }
}
