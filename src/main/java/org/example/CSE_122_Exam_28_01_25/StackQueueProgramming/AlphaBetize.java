package org.example.CSE_122_Exam_28_01_25.StackQueueProgramming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AlphaBetize {
    public static void main(String[] args) {
        Queue<String> myQueue= new LinkedList<>();
        myQueue.offer("august");
        myQueue.offer("cornelia street");
        myQueue.offer("bejeweled");
        myQueue.offer("cardigan");
        myQueue.offer("afterglow");

        System.out.println(alphabetize(myQueue));
    }

    public static Queue<String> alphabetize(Queue<String> words){
        if(words.isEmpty()){
            return words;
        }
        Stack<String> myStack = new Stack<>();

        int size = words.size();
        for (int i = 0; i < size; i++) {
            String word = words.poll();
            if (word != null && word.startsWith("a")) {
                myStack.push(word);
            } else {
                words.add(word);
            }
        }

        size = words.size();
        for (int i = 0; i < size; i++) {
            String word = words.poll();
            if (word != null && word.startsWith("b")) {
                myStack.push(word);
            } else {
                words.add(word);
            }
        }

        size = words.size();
        for (int i = 0; i < size; i++) {
            String word = words.poll();
            if (word != null && word.startsWith("c")) {
                myStack.push(word);
            } else {
                words.add(word);
            }
        }

        s2q(myStack, words);
        q2s(words, myStack);
        s2q(myStack, words);

        return words;
    }

    public static void s2q(Stack<String> s, Queue<String> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void q2s(Queue<String> q, Stack<String> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
}

