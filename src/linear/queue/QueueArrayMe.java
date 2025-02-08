package linear.queue;

import java.util.Arrays;

public class QueueArrayMe {
    private final int[] items;
    private int front = 0;
    private int rear = 0;

    public QueueArrayMe(int capacity) {
        items = new int[capacity];
    }

    //enqueue
    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException("The queue is full");

        items[rear++] = item;
    }

    //dequeue
    public int dequeue() {
        if (isEmpty())
            return -1;

        var value = items[front];
        front++;
        return value;
    }

    //peek
    public int peek() {
        return items[front];
    }

    //isEmpty
    public boolean isEmpty() {
        return rear == 0;
    }

    //isFull
    public boolean isFull() {
        return rear == items.length;
    }

    //[10,20,30,40]
    // F         R
    // F=0
    // R=3

    @Override
    public String toString() {
        var arrayCopy = Arrays.copyOfRange(items, front, rear);
        return Arrays.toString(arrayCopy);
    }
}
