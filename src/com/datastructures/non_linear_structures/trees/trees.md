# TREE
A tree is a data structure that stores data in a hierarchy


## Definitions:
**Nodes** -> Elements of the tree
Edges -> The  connectors of the tree.

**Edges** -> The lines that connect the nodes

**Root** -> The starting node of the tree, the top most one

**Children** -> nodes below the root or subtrees

**Leaf** -> A node without children

**Binary Tree** -> Can have a maximum of two children.



## Application of Trees:
1. Represent hierarchical data  ->  family tree or files and folder on your disk
2. Databases -> databases use trees for indexing to quickly lookup data.
3. Autocompletion -> Eg. chrome store all search queries in a tree
4. Compilers -> Use syntax tree to parse expressions
5. Compression -> Used in compression algorithm such as those used in (JPEG, MP3)

## Run time complexities of trees:
**left < node < right** => This is also true for subtrees. Trees have logarithmic time complexity
1. Search => O(log n)
2. Insert => O(log n)
3. Delete => O(log n)



## Tree Traversal
/***
*                        7
*                       / \
*                      4   9
*                    /  \ / \
*                   1   6 8  10
*

### Breadth First (Level Order Traversal)
Visit all nodes at a level before visiting the next node.

### Depth First
 
**1.Pre-order** => Root, Left, Right || Result => 7,4,1,6,9,8,10

**2.In-order** => Left, Root, Right || Result => 1,4,6,7,8,9,10 

By defualt orderis ascending, to get descending order, switch the order to : Root, Right, Left

**3.Post-order** => Left, Right, Root || Result => 1,6,4,8,10,9,7

Traversal start at the leaves upwards to the root

### Recursion

The process of a method calling itself.

### Depth  






