# Subarray with 0 Sum

**Link:** https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1  
**Pattern:** Prefix sum + HashSet  
**Complexity:** O(n) time, O(n) space

```java
public boolean subarrayWithZeroSum(int[] arr) {
    Set<Integer> prefixSums = new HashSet<>();
    int sum = 0;
    prefixSums.add(0); // For subarray starting from index 0
    
    for (int num : arr) {
        sum += num;
        if (prefixSums.contains(sum)) {
            return true; // Same prefix sum means 0 sum subarray
        }
        prefixSums.add(sum);
    }
    
    return false;
}
```
