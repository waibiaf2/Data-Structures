package com.datastructures.stacks;

import java.util.Arrays;

public class Stack {
    private int[] items = new int[5];
    private int count;

    public void push(int item) {
        if (count == items.length) {
            throw new IllegalStateException("Stack is full");
        }

        items[count++] = item;
    }

    public int pop() {
        if (count == 0) {
            throw new IllegalStateException("Stack is empty");
        }

        return items[--count];
    }

    public int peek() {
        if (count == 0) {
            throw new IllegalStateException("Stack is empty");
        }

        return items[count-1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
