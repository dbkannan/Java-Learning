# Detect Cycle in Undirected Graph

**Link:** https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1  
**Pattern:** DFS with parent tracking  
**Complexity:** O(V+E) time, O(V) space

```java
public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
    boolean[] visited = new boolean[V];
    
    for (int i = 0; i < V; i++) {
        if (!visited[i]) {
            if (dfs(i, -1, adj, visited)) {
                return true;
            }
        }
    }
    
    return false;
}

boolean dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
    visited[node] = true;
    
    for (int neighbor : adj.get(node)) {
        if (!visited[neighbor]) {
            if (dfs(neighbor, node, adj, visited)) {
                return true;
            }
        } else if (neighbor != parent) {
            return true; // Cycle detected
        }
    }
    
    return false;
}
```
