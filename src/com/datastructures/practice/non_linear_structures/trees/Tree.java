package com.datastructures.practice.non_linear_structures.trees;

public class Tree {
    private class Node {
        int value;
        Node leftChild;
        Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node [value=" + value + "]";
        }
    }

    private Node root;


    public void insert(int value) {
        var node2 = new Node(value);

        if(root == null) {
            root = node2;
            return;
        }

        var current = root;

        while (true) {
            if(value < current.value) {
                if(current.leftChild == null) {
                    current.leftChild = node2;
                    break;
                }
                current = current.leftChild;
            }else {
                if(current.rightChild == null) {
                    current.rightChild = node2;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;

        while (current != null) {
            if(value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            }else {
                return true;
            }
        }

        return false;
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }


    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void  inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.leftChild);
        System.out.println(root.value);
        inOrderTraversal(root.rightChild);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node root) {
        if(root == null) {
            return;
        }

        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.value);
    }
}
