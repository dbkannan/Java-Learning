# Binary Tree Postorder Traversal

**Link:** https://www.geeksforgeeks.org/problems/postorder-traversal/1  
**Pattern:** DFS - Left, Right, Root  
**Complexity:** O(n) time, O(h) space

```java
ArrayList<Integer> postOrder(Node root) {
    ArrayList<Integer> result = new ArrayList<>();
    postOrderHelper(root, result);
    return result;
}

void postOrderHelper(Node node, ArrayList<Integer> result) {
    if (node == null) return;
    
    postOrderHelper(node.left, result);  // Left
    postOrderHelper(node.right, result); // Right
    result.add(node.data);               // Root
}
```
