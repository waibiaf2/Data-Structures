package practice;

import java.util.NoSuchElementException;

public class LinkedListPractice {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        Node node = new Node(item);

        if(isEmpty())
            first = last = node;
        
        last.next = node;
        last = node;
        size++;
    }

    public void addFirst(int item) {
        Node node = new Node(item);

        if (isEmpty())
            first = last = node;
        
        node.next = first;
        first = node;
        size++;
    }

    public int indexOf(int item) {
        var current = first;
        int index = 0;

        while(current != null) {
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last) 
            first = last = null;
        
        var current = first;
        var next = current.next;
        current.next = null;
        first = next;
        size--;
    }

    public void removeLast() {
        if(isEmpty()) 
            throw new NoSuchElementException();


        var previous = getPrevious(last);

        if(first == last) 
            first = last = null;
        
        previous.next = null;
        last = previous;
        size--;

    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        int index = 0;

        while(current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public int size() {
        return size;
    }

    public void reverse() {
        var previous = first;
        var current = first.next;

        while(current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first= previous;
    }

    public int getKthNodeFromEnd(int k) {
        if(isEmpty()) 
            throw new IllegalStateException();

        var a = first;
        var b = first;

        for (int i = 0; i < k-1 ; i++) {
            b = b.next;
            if(b == null) 
                throw new IllegalArgumentException();
        }

        while(b == last) {
            a = a.next;
            b = b.next;
        }

        return a.value;
    }

    private Node getPrevious(Node node) {       
        var current = first;
        while(current != null) {
            if(current.next == node)
                return current;
            current = current.next;
        }

        return null;
    }

    private boolean isEmpty() {
        return first == null;
    }

}
