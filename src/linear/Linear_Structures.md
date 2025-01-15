# Linked Lists
- Node -> has a value and a pointer to the next node
- Each node is a separate object

## Complexity
- Access: O(n)
- Search: O(n)
- Insertion: 
  - At end -> O(1) 
  - At beginning -> O(1)
  - In middle -> O(n)
- Deletion: 
  - At end -> O(n)
  - At beginning -> O(1)
  - In middle -> O(n)

## Types of Linked Lists
- Singly Linked List -> Node has a pointer to the next node
- Doubly Linked List -> Node has a pointer to the next and previous node

# Stacks
- LIFO (Last In First Out), they are wrapper around the array data structure.
## Operations: 
  - Push -> O(1)
  - Pop -> O(1)
  - Peek -> O(1)
## Applications: 
  - Function calls
  - Undo operations
  - Navigation in web browsers
  - Expression evaluation eg calculator application.

# Queues
- Similar to stacks with the only difference being they are FIFO, implying that the first in first out.
## Appliactions
- Printer - managing jobs, prints then in the order they are submitted.
- Operating Systems - managing processes, wating the queue for their turn to run
- Web Servers - Requests are processed in the order they are submitted
- Live Support Systems -

## Operations
- enqueue: add to back -> O(1)
- dequeue: remove from front-> O(1)
- peek: get first item without removing it -> O(1)
- isEmpty -> O(1)
- isFull -> O(1)