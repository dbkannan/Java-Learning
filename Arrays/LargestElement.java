/*
 * Problem: Largest Element in Array
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0
 * 
 * Time Complexity: O(n) - where n is the size of the array
 * Space Complexity: O(1) - only using a single variable
 * 
 * Input Format: An integer array arr[]
 * Output Format: The largest element in the array
 */

import java.util.*;

class Solution {
    // Function to find the largest element in the array
    public int largest(int[] arr) {
        // Write your logic here
         int Max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>Max){
                Max = arr[i];
            }
        }
        return Max;
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
            
            // Create solution object and find largest
            Solution obj = new Solution();
            int result = obj.largest(arr);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
