# First Repeating Element

**Link:** https://www.geeksforgeeks.org/problems/first-repeating-element4018/1  
**Pattern:** HashSet for tracking seen elements  
**Complexity:** O(n) time, O(n) space

```java
public int firstRepeating(int[] arr) {
    Set<Integer> seen = new HashSet<>();
    int result = -1;
    
    for (int i = arr.length - 1; i >= 0; i--) {
        if (seen.contains(arr[i])) {
            result = i + 1; // 1-based index
        }
        seen.add(arr[i]);
    }
    
    return result;
}
```
