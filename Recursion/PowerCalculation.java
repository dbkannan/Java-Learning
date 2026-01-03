/*
 * Problem: Power of Numbers
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
 * 
 * Time Complexity: O(log n) - with fast exponentiation
 * Space Complexity: O(log n) - recursion call stack
 * 
 * Input Format: Two integers x and n
 * Output Format: x raised to power n (x^n) modulo 10^9+7
 * 
 * Note: Calculate x^n efficiently using divide and conquer
 */

import java.util.*;

class Solution {
    static final int MOD = 1000000007;
    
    // Function to calculate x^n using recursion
    // Return result modulo 10^9+7
    public long power(int x, int n) {
        // Write your logic here
        
    }
    
    // DO NOT MODIFY BELOW THIS LINE
    // ==============================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            // Read x and n
            int x = sc.nextInt();
            int n = sc.nextInt();
            
            // Create solution object and calculate power
            Solution obj = new Solution();
            long result = obj.power(x, n);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
