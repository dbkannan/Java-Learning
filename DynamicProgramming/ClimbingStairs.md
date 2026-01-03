# Climbing Stairs

**Link:** https://www.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1  
**Pattern:** DP - Fibonacci variant  
**Complexity:** O(n) time, O(1) space

```java
public int climbStairs(int n) {
    if (n <= 2) return n;
    
    int prev2 = 1, prev1 = 2;
    
    for (int i = 3; i <= n; i++) {
        int curr = prev1 + prev2;
        prev2 = prev1;
        prev1 = curr;
    }
    
    return prev1;
}

// Relation: ways(n) = ways(n-1) + ways(n-2)
// Same as Fibonacci!
```
