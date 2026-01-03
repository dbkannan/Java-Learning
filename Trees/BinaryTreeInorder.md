# Binary Tree Inorder Traversal

**Link:** https://www.geeksforgeeks.org/problems/inorder-traversal/1  
**Pattern:** DFS - Left, Root, Right  
**Complexity:** O(n) time, O(h) space

```java
ArrayList<Integer> inOrder(Node root) {
    ArrayList<Integer> result = new ArrayList<>();
    inOrderHelper(root, result);
    return result;
}

void inOrderHelper(Node node, ArrayList<Integer> result) {
    if (node == null) return;
    
    inOrderHelper(node.left, result);  // Left
    result.add(node.data);             // Root
    inOrderHelper(node.right, result); // Right
}
```
