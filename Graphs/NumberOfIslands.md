# Number of Islands

**Link:** https://www.geeksforgeeks.org/problems/find-the-number-of-islands/1  
**Pattern:** DFS/BFS for connected components  
**Complexity:** O(m*n) time, O(m*n) space

```java
public int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0) return 0;
    
    int count = 0;
    int m = grid.length, n = grid[0].length;
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (grid[i][j] == '1') {
                count++;
                dfs(grid, i, j);
            }
        }
    }
    
    return count;
}

void dfs(char[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
        return;
    }
    
    grid[i][j] = '0'; // Mark as visited
    
    // Visit all 8 directions
    dfs(grid, i+1, j);
    dfs(grid, i-1, j);
    dfs(grid, i, j+1);
    dfs(grid, i, j-1);
    dfs(grid, i+1, j+1);
    dfs(grid, i+1, j-1);
    dfs(grid, i-1, j+1);
    dfs(grid, i-1, j-1);
}
```
