# Remove Duplicates from Sorted Array

**Link:** https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1  
**Pattern:** Two Pointers (fast-slow)  
**Complexity:** O(n) time, O(1) space

```java
public int removeDuplicates(int[] arr) {
    if (arr.length == 0) return 0;
    
    int write = 1;
    for (int read = 1; read < arr.length; read++) {
        if (arr[read] != arr[read - 1]) {
            arr[write++] = arr[read];
        }
    }
    
    return write;
}
```
