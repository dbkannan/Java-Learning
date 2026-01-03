/*
 * Problem: Fibonacci Series
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1
 * 
 * Time Complexity: O(2^n) for naive recursion, O(n) with memoization
 * Space Complexity: O(n) - recursion call stack
 * 
 * Input Format: An integer n
 * Output Format: nth Fibonacci number
 * 
 * Note: Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21...
 *       fib(0) = 0, fib(1) = 1, fib(n) = fib(n-1) + fib(n-2)
 */

import java.util.*;

class Solution {
    // Function to find nth Fibonacci number using recursion
    public int fibonacci(int n) {
        // Write your logic here
        
    }
    
    // DO NOT MODIFY BELOW THIS LINE
    // ==============================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            // Read n
            int n = sc.nextInt();
            
            // Create solution object and find fibonacci
            Solution obj = new Solution();
            int result = obj.fibonacci(n);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
