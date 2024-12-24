package linear;

import java.util.NoSuchElementException;

public class LinkedList {
    private static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;

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

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    // 10 -> 20 -> 30 | 30-> last
    // previousNode -> 20
    //previousNode.next = null
    // last = previousNode
    public void removeLast() {
        if(isEmpty())
            throw new NoSuchElementException();

        var previous = getPreviousNode(last);

        if (first == last)
            first = last = null;

        assert previous != null;
        previous.next = null;
        last = previous;

        size--;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse() {
        if(isEmpty()) return;

        var previous = first;
        var current = first.next;

        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if(isEmpty())
            throw new IllegalStateException();

        /**
         * Create two pointers*/
        var a = first;
        var b = first;

        /**
         * Moving the second pointer b k-1 steps*/
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if(b == null)
                throw new IllegalArgumentException();
        }

        /**
         * Moving both pointers until b reaches the last node*/
        while(b != last){
            a = a.next;
            b = b.next;
        }

        /*
        * return value*/
        return a.value;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private Node getPreviousNode(Node node){
        var current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }
}
