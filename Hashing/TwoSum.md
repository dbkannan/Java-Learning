# Two Sum

**Link:** https://www.geeksforgeeks.org/problems/key-pair5616/1  
**Pattern:** HashSet/HashMap for complement  
**Complexity:** O(n) time, O(n) space

```java
public boolean twoSum(int[] arr, int target) {
    Set<Integer> seen = new HashSet<>();
    
    for (int num : arr) {
        int complement = target - num;
        if (seen.contains(complement)) {
            return true;
        }
        seen.add(num);
    }
    
    return false;
}
```
