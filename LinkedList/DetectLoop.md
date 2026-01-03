# Detect Loop in Linked List

**Link:** https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1  
**Pattern:** Floyd's Cycle Detection (Tortoise and Hare)  
**Complexity:** O(n) time, O(1) space

```java
boolean detectLoop(Node head) {
    if (head == null) return false;
    
    Node slow = head;
    Node fast = head;
    
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        
        if (slow == fast) {
            return true; // Loop detected
        }
    }
    
    return false;
}
```
