/*
 * Problem: Binary Search
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
 * 
 * Time Complexity: O(log n) - halves search space each iteration
 * Space Complexity: O(1) - iterative approach
 * 
 * Input Format: Sorted array arr[] and target element k
 * Output Format: Index of k if found, otherwise -1
 * 
 * Note: Array is sorted in ascending order
 */

import java.util.*;

class Solution {
    // Function to perform binary search
    // Returns index if found, -1 otherwise
    public int binarySearch(int[] arr, int k) {
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
            
            // Read target
            int k = sc.nextInt();
            
            // Create solution object and perform binary search
            Solution obj = new Solution();
            int result = obj.binarySearch(arr, k);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
