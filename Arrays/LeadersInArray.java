/*
 * Problem: Leaders in an Array
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
 * 
 * Time Complexity: O(n) - single pass from right to left
 * Space Complexity: O(n) - for storing result (output space)
 * 
 * Input Format: An integer array arr[]
 * Output Format: ArrayList containing all leaders in order of appearance
 * 
 * Note: An element is a leader if it is greater than or equal to all elements to its right
 * The rightmost element is always a leader
 */

import java.util.*;

class Solution {
    // Function to find the leaders in the array
    // Leaders are elements greater than all elements to their right
    static ArrayList<Integer> leaders(int arr[]) {
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
            
            // Find leaders
            ArrayList<Integer> result = leaders(arr);
            
            // Print leaders
            for (int leader : result) {
                System.out.print(leader + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
