package org.example.Problems_Stack_Queue;

import java.util.Stack;

public class CreateQueueUsingStack {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue.empty());
        queue.poll();  // do i have to sout or not
        System.out.println(queue.empty());


    }

    public static class MyQueue{
        private Stack<Integer> stack = new Stack<>();

        public void offer(int x){
            stack.push(x);

//            for(int i = 0; i < stack.size() - 1; i++){
//                stack.push(stack.pop());
//            }

        }

        public void poll(){
            if(stack.isEmpty()){
                throw new RuntimeException("Queue is Empty");
            }
            stack.pop();
        }

        public int peek(){
            if(stack.isEmpty()){
                throw new RuntimeException("Queue is Empty");
            }
            return stack.peek();   // not .top();
        }

        public boolean empty(){
            return stack.isEmpty();
        }
    }
}
