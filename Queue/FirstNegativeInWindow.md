# First Negative in Every Window

**Link:** https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1  
**Pattern:** Sliding window + Queue  
**Complexity:** O(n) time, O(k) space

```java
public long[] firstNegative(long[] arr, int k) {
    int n = arr.length;
    long[] result = new long[n - k + 1];
    Queue<Integer> queue = new LinkedList<>(); // Store indices of negatives
    
    // Process first window
    for (int i = 0; i < k; i++) {
        if (arr[i] < 0) queue.add(i);
    }
    
    // First window result
    result[0] = queue.isEmpty() ? 0 : arr[queue.peek()];
    
    // Process remaining windows
    for (int i = k; i < n; i++) {
        // Remove elements outside window
        while (!queue.isEmpty() && queue.peek() < i - k + 1) {
            queue.poll();
        }
        
        // Add new negative if exists
        if (arr[i] < 0) queue.add(i);
        
        result[i - k + 1] = queue.isEmpty() ? 0 : arr[queue.peek()];
    }
    
    return result;
}
```
