/*
 * Problem: Reverse an Array
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/reverse-an-array/1
 * 
 * Time Complexity: O(n) - where n is the size of the array
 * Space Complexity: O(1) - in-place reversal
 * 
 * Input Format: An integer array arr[]
 * Output Format: The same array reversed in-place
 */

import java.util.*;

class Solution {
    // Function to reverse the array
    // You need to modify the array in-place
    public void reverseArray(int arr[]) {
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
            
            // Create solution object and reverse array
            Solution obj = new Solution();
            obj.reverseArray(arr);
            
            // Print reversed array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
