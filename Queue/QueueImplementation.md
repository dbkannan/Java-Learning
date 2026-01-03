# Queue Implementation

**Link:** https://www.geeksforgeeks.org/problems/implement-queue-using-array/1  
**Pattern:** Array-based queue  
**Complexity:** O(1) operations

```java
class MyQueue {
    int[] arr;
    int front, rear;
    
    MyQueue() {
        arr = new int[100005];
        front = 0;
        rear = 0;
    }
    
    void enqueue(int x) {
        arr[rear++] = x;
    }
    
    int dequeue() {
        if (front == rear) return -1;
        return arr[front++];
    }
}
```
