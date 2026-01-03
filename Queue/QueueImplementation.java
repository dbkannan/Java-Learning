/* Problem: Implement Queue using Array
 * Link: https://www.geeksforgeeks.org/problems/implement-queue-using-array/1
 * Time: O(1) for all operations */

import java.util.*;

class MyQueue {
    int[] arr;
    int front, rear;
    
    MyQueue() {
        arr = new int[100005];
        front = 0;
        rear = 0;
    }
    
    void enqueue(int x) {
        // Write your logic here
    }
    
    int dequeue() {
        // Write your logic here
        return -1;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            MyQueue queue = new MyQueue();
            int q = sc.nextInt();
            while (q-- > 0) {
                int type = sc.nextInt();
                if (type == 1) {
                    int x = sc.nextInt();
                    queue.enqueue(x);
                } else {
                    System.out.println(queue.dequeue());
                }
            }
        }
        sc.close();
    }
}
