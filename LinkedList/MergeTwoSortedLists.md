# Merge Two Sorted Lists

**Link:** https://www.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1  
**Pattern:** Two pointers  
**Complexity:** O(m+n) time, O(1) space

```java
Node mergeTwoLists(Node l1, Node l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;
    
    Node dummy = new Node(0);
    Node curr = dummy;
    
    while (l1 != null && l2 != null) {
        if (l1.data <= l2.data) {
            curr.next = l1;
            l1 = l1.next;
        } else {
            curr.next = l2;
            l2 = l2.next;
        }
        curr = curr.next;
    }
    
    curr.next = (l1 != null) ? l1 : l2;
    
    return dummy.next;
}
```
