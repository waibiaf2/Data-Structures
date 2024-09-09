package com.datastructures.practice.linkedLists;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size;

    public void addFirst(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void add(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) head = tail = newNode;

        if (head == tail) {
            head.next = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void add(int index, int value) {
        Node newNode = new Node(value);

        if (index < 0 && index < size) {
            throw new IndexOutOfBoundsException("The provided index is invalid");
        }

        Node current = head;
        int count = 0;

        if (isEmpty()) {
            head = tail = newNode;
        }

        if (head == tail) {
            head.next = tail = newNode;
        } else {
            while (current != null) {
                if (count == index) {
                    Node next = current.next;
                    newNode.next = next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
                count++;
            }
        }

        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int indexOf(int value) {
        int index = 0;
        Node current = head;

        while (current != null) {
            if (current.value == value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (head == tail) {
            head = tail = null;
        } else {
            Node next = head.next;
            head.next = null;
            head = next;
        }

        size--;
    }

    public void deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (head == tail) {
            head = tail = null;
        } else {
            Node previous = getPrevious(tail);
            tail = previous;
            previous.next = null;
        }

        size--;
    }

    public int[] toArray() {
        int[] array = new int[size];
        int index = 0;
        Node current = head;

        while (current != null && (index >= 0 && index < size)) {
            array[index++] = current.value;
            current = current.next;

        }

        return array;
    }

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return head == null;
    }

    private Node getPrevious(Node node) {
        Node currrent = head;
        while (currrent != null) {
            if (currrent.next.value == node.value) return currrent;
            currrent = currrent.next;
        }

        return null;
    }
}
