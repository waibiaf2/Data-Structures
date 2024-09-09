package com.datastructures.stacks;

import java.util.Arrays;

public class StackMine {
    // Stack
    //push
    //pop
    //peek
    //isEmpty
    //int[]
    private int[] stack;
    private int counter = 0;
    private int length = 0;

    public StackMine(int size) {
        this.length = size;
        this.stack = new int[length];
    }

    public void push(int value) {
        if (counter < stack.length) {
            stack[counter++] = value;
            System.out.println(counter);
        }
    }

    public int pop() {
        counter--;

        if (counter > 0) {
            int value = stack[counter];
            stack[counter] = 0;
            length--;

            stack = resizeStack(stack);

            return value;
        }

        return -1;
    }

    public int peek(int index) {
        return stack[counter];
    }

    public boolean isEmpty() {
        return stack.length == 0;
    }

    public void print() {
        System.out.println(Arrays.toString(stack));
    }

    private int[] resizeStack(int[] stack) {
        int[] newArray = new int[length];
        System.arraycopy(stack, 0, newArray, 0, length);
       return newArray;
    }
}
