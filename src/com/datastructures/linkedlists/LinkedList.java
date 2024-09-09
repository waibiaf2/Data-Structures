package com.datastructures.linkedlists;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int value) {
        var node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }

        size++;
    }

    public void addLast(int item) {
        var newNode = new Node(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = head;
        while (current != null) {
            if (current.value == item)
                return index;

            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (head == tail) {
            head = tail = null;
        }else{
            var second = head.next;
            head.next = null;
            head = second;
        }

        size--;
    }

    /*public void delete(Node node) {

    }*/

    public void deleteLast() {
        //[10 -> 20 -> 30]
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (head == tail) {
            head = tail = null;
        }else {
            var previous = getPrevious(tail);
            tail = previous;
            tail.next = null;
        }

        size--;
    }

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return head == null;
    }

    private Node getPrevious(Node node) {
        //[10->12-15-400-85]
        var current = head;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        // [20 -> 30 -> 40 -> 100] -> [100 -> 40 -> 30 -> 20]
        //  p      c
        //         n     p

        var previous = head;
        var current = head.next;
        tail = head;
        tail.next = null;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    public int getKthFromTheEnd(int k) {
        // 3rd last element
        //[23,19,44,60,80,11,45,90]
        //          a            b
        var first = head;
        var second = head;

        for (int i = 0; i < k-1; i++)
            second = second.next;

        while (second != tail) {
            first = first.next;
            second = second.next;
        }

        return first.value;
    }
}
