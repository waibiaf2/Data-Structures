package practice;

public class LinkedList {
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

    

    private boolean isEmpty() {
        return first == null;
    }

}
