# Pair Sum (Two Pointers)

**Link:** https://www.geeksforgeeks.org/problems/pair-sum-existence/1  
**Pattern:** Two Pointers on sorted array  
**Complexity:** O(n) time, O(1) space

```java
public boolean pairSum(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    
    while (left < right) {
        int sum = arr[left] + arr[right];
        if (sum == target) return true;
        else if (sum < target) left++;
        else right--;
    }
    
    return false;
}
```
