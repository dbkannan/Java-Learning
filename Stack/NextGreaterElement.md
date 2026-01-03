# Next Greater Element

**Link:** https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1  
**Pattern:** Monotonic stack  
**Complexity:** O(n) time, O(n) space

```java
public int[] nextGreater(int[] arr) {
    int n = arr.length;
    int[] result = new int[n];
    Stack<Integer> stack = new Stack<>();
    
    // Traverse from right to left
    for (int i = n - 1; i >= 0; i--) {
        // Pop elements smaller than current
        while (!stack.isEmpty() && stack.peek() <= arr[i]) {
            stack.pop();
        }
        
        result[i] = stack.isEmpty() ? -1 : stack.peek();
        stack.push(arr[i]);
    }
    
    return result;
}
```
