package non_linear.binary_trees;

public class Tree {
    private static class Node {
        int value;
        Node leftChild;
        Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return
                "Node{" +
                "value=" + value
                + "}";
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;

        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var currrent = root;
        while (currrent != null) {
            if (value == currrent.value) {
                return true;
            }

            if (value < currrent.value)
                currrent = currrent.leftChild;
            else
                currrent = currrent.rightChild;
        }

        return false;
    }

    public boolean find2(int value) {
        var current = root;

        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }

        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }
    private void traversePreOrder(Node root) {
        // root , leftChild, rightChild
        if (root == null)
            return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }


    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if(root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }


    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traversePostOrder(root.rightChild);
        traversePostOrder(root.leftChild);
        System.out.println(root.value);

    }
}
