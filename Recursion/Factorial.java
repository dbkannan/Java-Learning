/*
 * Problem: Factorial of a Number
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/factorial5739/1
 * 
 * Time Complexity: O(n) - n recursive calls
 * Space Complexity: O(n) - recursion call stack
 * 
 * Input Format: An integer n
 * Output Format: Factorial of n (n!)
 * 
 * Note: Factorial of n = n * (n-1) * (n-2) * ... * 1
 *       0! = 1, 1! = 1
 */

import java.util.*;

class Solution {
    // Function to find factorial using recursion
    public long factorial(int n) {
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
            
            // Create solution object and calculate factorial
            Solution obj = new Solution();
            long result = obj.factorial(n);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
