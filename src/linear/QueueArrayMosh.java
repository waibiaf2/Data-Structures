package linear;

import java.util.Arrays;

public class QueueArrayMosh {
    private final int[] items;
    private int count;
    private int rear;
    private int front;

    public QueueArrayMosh(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if(count == items.length)
            throw new IllegalStateException("The queue is full");

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;

        /** Implementing circular arrays
         * if our length is 5
         * [0,0,30,40,50]
         *            R
         *            4
         * To add another element
         * Left     Right
         * 5  -> 0  Right = length % left
         * 6 -> 1
         * 7 -> 2
         * 8 -> 3
         * 9 -> 4
         * 10 -> 0
         * 11 -> 1
         * but left = (R,4) + 1
         * rear, R = (Left % length)
         *       R = (R+1) % length
         * */

    }

    public int dequeue() {
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;

        return item;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        //var arrayCopy = Arrays.copyOfRange(items, front, rear);
        return Arrays.toString(items);
    }
}
