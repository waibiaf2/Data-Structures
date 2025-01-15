package linear;

import java.util.Arrays;
import java.util.Stack;

public class QueueWithTwoStackMe {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        int item = 0;

        while (!stack1.isEmpty()) {
            item = stack1.pop();
            stack2.push(item);
        }

        stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return  item;
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    @Override
    public String toString() {
       var  myArray = stack1.toArray();
        return Arrays.toString(myArray);
    }
}
