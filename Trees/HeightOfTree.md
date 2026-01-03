# Height of Binary Tree

**Link:** https://www.geeksforgeeks.org/problems/height-of-binary-tree/1  
**Pattern:** Recursion  
**Complexity:** O(n) time, O(h) space

```java
int height(Node root) {
    if (root == null) {
        return 0;
    }
    
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    
    return Math.max(leftHeight, rightHeight) + 1;
}
```
