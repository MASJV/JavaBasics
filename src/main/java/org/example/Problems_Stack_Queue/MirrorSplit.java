package org.example.Problems_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MirrorSplit {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(14);
        stack.push(20);
        stack.push(8);
        stack.push(12);

        Stack<Integer> stack2 = new Stack<>();
        stack.push(13);
        stack.push(5);
        stack.push(12);

        System.out.println(mirrorSplit(stack));
        System.out.println(mirrorSplit(stack2));

    }

    public static Stack<Integer> mirrorSplit(Stack<Integer> original){
        Stack<Integer> s2 = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();


    }
}
