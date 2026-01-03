/* Problem: Implement Stack using Array
 * Link: https://www.geeksforgeeks.org/problems/implement-stack-using-array/1
 * Time: O(1) for all operations */

import java.util.*;

class MyStack {
    int[] arr;
    int top;
    
    MyStack() {
        arr = new int[1000];
        top = -1;
    }
    
    void push(int x) {
        // Write your logic here
    }
    
    int pop() {
        // Write your logic here
        return -1;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            MyStack stack = new MyStack();
            int q = sc.nextInt();
            while (q-- > 0) {
                int type = sc.nextInt();
                if (type == 1) {
                    int x = sc.nextInt();
                    stack.push(x);
                } else {
                    System.out.println(stack.pop());
                }
            }
        }
        sc.close();
    }
}
