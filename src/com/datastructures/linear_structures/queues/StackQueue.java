package com.datastructures.linear_structures.queues;

import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    // Q [10,55,99,64]
    // S1 [] -> used for enqueue
    // S2 [64,99,55,10] -> used for dequeue
    private Queue<Integer> queue;
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;
    int size = 0;


    public void enqueue(int value) {
        queue.add(value);
        enqueueStack.push(value);
        size++;
    }

    public int dequeue() {
        while (dequeueStack.size() > 0) {
            dequeueStack.push(enqueueStack.pop());
        }

        queue.remove(queue.size() - 1);
        return dequeueStack.pop();
    }
}
