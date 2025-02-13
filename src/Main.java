import linear.hasmap_hashset.HashTable;
import non_linear.binary_trees.Tree;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(6);
        tree.insert(1);
        tree.insert(9);
        tree.insert(10);
        tree.insert(8);

        System.out.println(tree.find(10));

        System.out.println("Done");

        System.out.println("============= Pre Order ================");
        tree.traversePreOrder();
        System.out.println("============= In Order ================");
        tree.traverseInOrder();
        System.out.println("============= Post Order ================");
        tree.traversePostOrder();

        System.out.println("done");

    }


}