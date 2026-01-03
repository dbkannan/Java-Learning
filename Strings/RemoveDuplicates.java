/*
 * Problem: Remove Duplicates from Sorted String
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/remove-duplicates3034/1
 * 
 * Time Complexity: O(n) - single pass through string
 * Space Complexity: O(n) - for building result string
 * 
 * Input Format: A sorted string s
 * Output Format: String with duplicate characters removed
 * 
 * Note: String is already sorted, adjacent duplicates should be removed
 */

import java.util.*;

class Solution {
    // Function to remove duplicates from a sorted string
    // Keep only first occurrence of each character
    public String removeDuplicates(String s) {
        // Write your logic here
        
    }
    
    // DO NOT MODIFY BELOW THIS LINE
    // ==============================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        while (t-- > 0) {
            // Read string
            String s = sc.nextLine();
            
            // Create solution object and remove duplicates
            Solution obj = new Solution();
            String result = obj.removeDuplicates(s);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
