package org.example.Problems_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CreateStackUsingQueue {    // should i do for 2 stacks and 2 queues instead of just 1
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.empty());
        stack.pop();  // do i have to sout or not
        System.out.println(stack.empty());
    }

    public static class MyStack{ // no public required?????  // also static ka reason for error???
        private Queue<Integer> queue = new LinkedList<>();  // why not int(null should not be there!?)

        public void push(int x){
            queue.offer(x);

            for(int i = 0; i < queue.size() - 1; i++){   // why size and wrong output?????
                queue.offer(queue.poll());
            }
        }

        public void pop(){
            if(queue.isEmpty()){
                throw new RuntimeException("Stack is empty");
            }
            queue.poll(); //does it return in stack implementation???
        }

        public int top(){
            if(queue.isEmpty()){
                throw new RuntimeException("Stack is empty");
            }
            return queue.peek();
        }

        public boolean empty(){
            return queue.isEmpty();
        }
    }
}
