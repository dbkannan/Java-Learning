# Linked List Insertion

**Link:** https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0  
**Complexity:** O(1) at beginning, O(n) at end

```java
Node insertAtBeginning(Node head, int x) {
    Node newNode = new Node(x);
    newNode.next = head;
    return newNode;
}

Node insertAtEnd(Node head, int x) {
    Node newNode = new Node(x);
    if (head == null) return newNode;
    
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = newNode;
    return head;
}
```
