# Middle of Linked List

**Link:** https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1  
**Pattern:** Slow-fast pointer  
**Complexity:** O(n) time, O(1) space

```java
int getMiddle(Node head) {
    if (head == null) return -1;
    
    Node slow = head;
    Node fast = head;
    
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    
    return slow.data;
}
```
