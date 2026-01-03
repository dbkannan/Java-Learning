# Reverse a Linked List

**Link:** https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1  
**Pattern:** Three pointers  
**Complexity:** O(n) time, O(1) space

```java
Node reverseList(Node head) {
    Node prev = null;
    Node curr = head;
    
    while (curr != null) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    
    return prev;
}
```
