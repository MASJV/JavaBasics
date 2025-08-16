package org.example.Problems_Stack_Queue;

import java.util.*;

public class RemoveMin {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(8);
        stack.push(3);
        stack.push(19);
        stack.push(7);
        stack.push(3);
        stack.push(2);
        stack.push(42);
        stack.push(9);
        stack.push(3);
        stack.push(2);
        stack.push(7);
        stack.push(12);
        stack.push(-8);
        stack.push(4);

        System.out.println(removeMin(stack));
        System.out.println(removeMin(stack));


    }

    public static Integer removeMin(Stack<Integer> original){
        Queue<Integer> queue = new LinkedList<>();

        int min = Integer.MAX_VALUE;
        while(!original.isEmpty()){
            int current = original.pop();
            if(current < min){
                min = current;
            }
            queue.offer(current);
        }

        while(!queue.isEmpty()){
            int current = queue.poll();
            if(current != min){
                original.push(current);
            }
        }

        s2q(original,queue);
        q2s(queue, original);

//        List<Integer> stackasList = new ArrayList<>(original);

        return min;
        // how to return stack as list along with min

    }

    public static void s2q(Stack<Integer> s, Queue<Integer> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void q2s(Queue<Integer> q, Stack<Integer> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }


}
