/*
 * Problem: Print N to 1
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1
 * 
 * Time Complexity: O(n) - n recursive calls
 * Space Complexity: O(n) - recursion call stack
 * 
 * Input Format: An integer n
 * Output Format: Print numbers from n to 1 (space-separated)
 */

import java.util.*;

class Solution {
    // Function to print n to 1 using recursion
    // Base case: when n <= 0, stop
    // Recursive case: print n, then recurse for n-1
    public void printNos(int n) {
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
            
            // Create solution object and print
            Solution obj = new Solution();
            obj.printNos(n);
            System.out.println();
        }
        
        sc.close();
    }
}
