package com.datastructures;


import com.datastructures.practice.non_linear_structures.trees.Tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(6);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        System.out.println(tree.find(80));

        System.out.println("================Pre Order =================");
        tree.preOrderTraversal();
        System.out.println("================= In Oder Traversal =========");
        tree.inOrderTraversal();
        System.out.println("============= Post Order Traversal =========");
        tree.postOrderTraversal();

        System.out.println("Done");
    }

    public static int factorial(int n) {
        var factorial = 1;
        for (var i = n; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }
}
