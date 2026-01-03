/* Problem: Queue using Two Stacks
 * Link: https://www.geeksforgeeks.org/problems/queue-using-two-stacks/1
 * Time: Amortized O(1) */

import java.util.*;

class MyQueue {
    Stack<Integer> s1, s2;
    
    MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
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
