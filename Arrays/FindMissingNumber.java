/*
 * Problem: Find Missing Number in Array
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
 * 
 * Time Complexity: O(n) - single pass through the array
 * Space Complexity: O(1) - only using constant space
 * 
 * Input Format: Array of n-1 integers from 1 to n with one number missing
 * Output Format: The missing number
 */

import java.util.*;

class Solution {
    // Function to find the missing number
    // Array contains n-1 elements from 1 to n
    public int missingNumber(int n, int arr[]) {
        // Write your logic here
        
    }
    
    // DO NOT MODIFY BELOW THIS LINE
    // ==============================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            // Read n (range is 1 to n)
            int n = sc.nextInt();
            
            // Array will have n-1 elements
            int[] arr = new int[n - 1];
            
            // Read array elements
            for (int i = 0; i < n - 1; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Create solution object and find missing number
            Solution obj = new Solution();
            int result = obj.missingNumber(n, arr);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
