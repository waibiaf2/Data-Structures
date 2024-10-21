package com.datastructures.non_linear_structures.trees;

public class Tree {
    /***
     *                        7
     *                       / \
     *                      4   9
     *                    /  \ / \
     *                   1   6 8  10
     *
     * */
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node= " + value;
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
        var current = root;

        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                return true;
            }
        }

        return false;
    }

    public void  preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node root) {
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
        if (root == null) {
            return;
        }
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.value);
    }

    public int height() {
        return height(root);
    }
    
    /*
    * If it's a binary  search tree -> root.left < root && root.right > root
    * below is the algorithm....
    * */
    
    //O(log n)
    public int heightBinarySearchTree() {
        return heightBinarySearchTree(root);
    }
    
    private int heightBinarySearchTree(Node root) {
        if (root == null)
            throw new IllegalStateException("Cannot find minimum value of the empty tree");
        
        var last = root.value;
        var  current = root;
        
        while (current != null) {
            last = current.value;
            current = current.leftChild;
        }
        
        return last;
    }

    // O(n)
    private int height(Node root) {
        if(root == null)
            return -1;

        if (isLeaf(root)) {
            return 0;
        }

        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild)
        );
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {
        if (isLeaf(root)) {
            return root.value;
        }

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    /**
     * Checking Equality algorithm
     * 1.
     * */
    public boolean equals(Tree tree1, Tree tree2) {

    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }
}

