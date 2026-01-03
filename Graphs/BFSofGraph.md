# BFS of Graph

**Link:** https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1  
**Pattern:** BFS using Queue  
**Complexity:** O(V+E) time, O(V) space

```java
public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
    ArrayList<Integer> result = new ArrayList<>();
    boolean[] visited = new boolean[V];
    Queue<Integer> queue = new LinkedList<>();
    
    queue.add(0); // Start from vertex 0
    visited[0] = true;
    
    while (!queue.isEmpty()) {
        int node = queue.poll();
        result.add(node);
        
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                queue.add(neighbor);
            }
        }
    }
    
    return result;
}
```
