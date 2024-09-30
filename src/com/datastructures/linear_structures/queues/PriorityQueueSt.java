package com.datastructures.linear_structures.queues;

import java.util.Arrays;

public class PriorityQueueSt {
    private final int[] items = new int[5];
    private int count;

    public void add(int item) {
        if(isFull())
            throw new IllegalStateException("Queue is full");

        var insertionPosition = shiftItemsToInsert(item);
        items[insertionPosition] = item;
        count++;
    }


    public int remove() {
        try {
            return items[--count];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalStateException("Queue is empty");
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }


    public int shiftItemsToInsert(int item) {
        int i;
        for(i = count - 1; i >= 0; i--) {
            if(items[i] > item) {
                items[i + 1] = items[i];
            }else {
                break;
            }
        }

        return i + 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
