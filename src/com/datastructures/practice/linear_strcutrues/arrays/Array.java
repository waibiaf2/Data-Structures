package com.datastructures.practice.linear_strcutrues.arrays;

public class Array {
    int[] items;
    int count;

    public Array(int length) {
        this.items = new int[length];
    }

    //O(1)
    public void insert(int item) {
        if(count == items.length) {
            int[] newItems = new int[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, count);
            items = newItems;
        }

        items[count++] = item;
    }

    //O(n)
    public void removeAt(int index) {
        // 1. check whether provided index in valid
        // 2. Shift all elements respectively, replacing the element at the provided index
        // 3. Decrement count

        if(index < 0 || index >= count) {
            throw new IllegalArgumentException("Position is out of bounds");
        }

        for (int i = index; i < count - 1; i++) {
            items[index] = items[i + 1];
        }

        count--;
    }

    //O(n)
    public int indexOf(int item) {
        /*for (int i = 0; i < count; i++) {
            if(items[i] == item) return i;
        }*/
        int index = 0;
        for(int num: items) {
            if (num == item) return index;
            index++;
        }
        return -1;
    }

    public void print() {
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}
