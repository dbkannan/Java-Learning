# Stack Implementation

**Link:** https://www.geeksforgeeks.org/problems/implement-stack-using-array/1  
**Pattern:** Array-based stack  
**Complexity:** O(1) all operations

```java
class MyStack {
    int[] arr;
    int top;
    
    MyStack() {
        arr = new int[1000];
        top = -1;
    }
    
    void push(int x) {
        if (top < arr.length - 1) {
            arr[++top] = x;
        }
    }
    
    int pop() {
        if (top >= 0) {
            return arr[top--];
        }
        return -1;
    }
}
```
