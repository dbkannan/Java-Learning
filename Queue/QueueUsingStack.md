# Queue using Two Stacks

**Link:** https://www.geeksforgeeks.org/problems/queue-using-two-stacks/1  
**Pattern:** Two stacks to simulate queue  
**Complexity:** Amortized O(1)

```java
class MyQueue {
    Stack<Integer> s1, s2;
    
    MyQueue() {
        s1 = new Stack<>(); // For enqueue
        s2 = new Stack<>(); // For dequeue
    }
    
    void enqueue(int x) {
        s1.push(x);
    }
    
    int dequeue() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) return -1;
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}
```
