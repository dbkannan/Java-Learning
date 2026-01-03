/*
 * Problem: Second Largest Element
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/second-largest3735/1
 * 
 * Time Complexity: O(n) - single pass through the array
 * Space Complexity: O(1) - only using two variables
 * 
 * Input Format: An integer array arr[]
 * Output Format: The second largest distinct element, or -1 if doesn't exist
 */

import java.util.*;

class Solution {
    // Function to find the second largest distinct element
    // Returns -1 if second largest doesn't exist
    public int getSecondLargest(int[] arr) {
        // Write your logic here
        
    }
    
    // DO NOT MODIFY BELOW THIS LINE
    // ==============================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            // Read array size
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            // Read array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Create solution object and find second largest
            Solution obj = new Solution();
            int result = obj.getSecondLargest(arr);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
