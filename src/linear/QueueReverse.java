package linear;

import java.util.ArrayDeque;
import java.util.Stack;
import java.util.Queue;

public class QueueReverse {
    public static Queue<Integer> reverse(Queue<Integer> queue) {
        //[30,20,60,900,805,500]
        // Remove items from queue one by and add it to a stack
        // stack -> 500,805,900,60,20,30
        // create a queue, and pop on item at a time from the stack, and add it to the new queue, then return it.

        // add
        // remove
        // isEmpty

        Queue<Integer> queueItems = new ArrayDeque<>();
        Stack<Integer> queueStack = new Stack<>();

        while (!queue.isEmpty()) {
            queueStack.push(queue.remove());
        }

        while (!queueStack.isEmpty()) {
            queueItems.add(queueStack.pop());
        }

        return queueItems;

    }

    public static Queue<Integer> reverse2(Queue<Integer> queue) {
        // Q [30,20,10,]
        // S [  ]
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());

        return queue;
    }
}
