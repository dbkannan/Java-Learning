# Binary Tree Preorder Traversal

**Link:** https://www.geeksforgeeks.org/problems/preorder-traversal/1  
**Pattern:** DFS - Root, Left, Right  
**Complexity:** O(n) time, O(h) space

```java
ArrayList<Integer> preOrder(Node root) {
    ArrayList<Integer> result = new ArrayList<>();
    preOrderHelper(root, result);
    return result;
}

void preOrderHelper(Node node, ArrayList<Integer> result) {
    if (node == null) return;
    
    result.add(node.data);             // Root
    preOrderHelper(node.left, result);  // Left
    preOrderHelper(node.right, result); // Right
}
```
