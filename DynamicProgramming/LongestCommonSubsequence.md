# Longest Common Subsequence

**Link:** https://www.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1  
**Pattern:** 2D DP - String matching  
**Complexity:** O(m*n) time, O(m*n) space

```java
public int lcs(String s1, String s2) {
    int m = s1.length(), n = s2.length();
    int[][] dp = new int[m + 1][n + 1];
    
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (s1.charAt(i-1) == s2.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1] + 1;  // Match
            } else {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);  // Take max
            }
        }
    }
    
    return dp[m][n];
}
```
