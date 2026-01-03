# Stock Span Problem

**Link:** https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1  
**Pattern:** Monotonic stack for previous greater  
**Complexity:** O(n) time, O(n) space

```java
public int[] calculateSpan(int[] price) {
    int n = price.length;
    int[] span = new int[n];
    Stack<Integer> stack = new Stack<>(); // Store indices
    
    for (int i = 0; i < n; i++) {
        // Pop indices while price is greater than or equal
        while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
            stack.pop();
        }
        
        span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
        stack.push(i);
    }
    
    return span;
}
```
