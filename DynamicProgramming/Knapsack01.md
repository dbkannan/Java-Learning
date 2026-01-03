# 0/1 Knapsack

**Link:** https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1  
**Pattern:** 2D DP table  
**Complexity:** O(n*W) time, O(n*W) space

```java
public int knapSack(int W, int[] wt, int[] val, int n) {
    int[][] dp = new int[n + 1][W + 1];
    
    for (int i = 1; i <= n; i++) {
        for (int w = 1; w <= W; w++) {
            if (wt[i-1] <= w) {
                // Include or exclude
                dp[i][w] = Math.max(
                    val[i-1] + dp[i-1][w - wt[i-1]],  // Include
                    dp[i-1][w]                         // Exclude
                );
            } else {
                dp[i][w] = dp[i-1][w];  // Can't include
            }
        }
    }
    
    return dp[n][W];
}
```
