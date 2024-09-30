package com.datastructures.linear_structures.queues;

import java.util.Arrays;

public class ArrayQueue {
    private final int[] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalArgumentException("Queue is full");
        /**
         * Implementing a circular array, the next index if the array is full can be found by (presumedIndex % array.length)
         * [0,0,0,0,0]
         * (0+1) % 5
        * */

        /*Before implimenting circular*/
        /*items[rear++] = item;*/

        /*The above commented out code becomesM 1%5*/
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        var item =  items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;

        if (item == 0)
            throw new IllegalArgumentException("The Queue is empty");

        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
