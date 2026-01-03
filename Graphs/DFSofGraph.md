# DFS of Graph

**Link:** https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1  
**Pattern:** DFS using Recursion/Stack  
**Complexity:** O(V+E) time, O(V) space

```java
public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
    ArrayList<Integer> result = new ArrayList<>();
    boolean[] visited = new boolean[V];
    dfsHelper(0, adj, visited, result); // Start from vertex 0
    return result;
}

void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, 
               boolean[] visited, ArrayList<Integer> result) {
    visited[node] = true;
    result.add(node);
    
    for (int neighbor : adj.get(node)) {
        if (!visited[neighbor]) {
            dfsHelper(neighbor, adj, visited, result);
        }
    }
}
```
