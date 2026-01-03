# Fibonacci DP

**Link:** https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1  
**Pattern:** Bottom-up DP  
**Complexity:** O(n) time, O(1) space

```java
static int MOD = 1000000007;

public int nthFibonacci(int n) {
    if (n <= 1) return n;
    
    int prev2 = 0, prev1 = 1;
    
    for (int i = 2; i <= n; i++) {
        int curr = (prev1 + prev2) % MOD;
        prev2 = prev1;
        prev1 = curr;
    }
    
    return prev1;
}
```
