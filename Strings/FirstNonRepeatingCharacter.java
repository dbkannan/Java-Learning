/*
 * Problem: Non Repeating Character
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1
 * 
 * Time Complexity: O(n) - two passes through the string
 * Space Complexity: O(1) - fixed size array for 26 letters
 * 
 * Input Format: A string s
 * Output Format: First non-repeating character, or '$' if none exists
 */

import java.util.*;

class Solution {
    // Function to find the first non-repeating character
    // Return '$' if no such character exists
    public char firstNonRepeatingChar(String s) {
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
            
            // Create solution object and find first non-repeating char
            Solution obj = new Solution();
            char result = obj.firstNonRepeatingChar(s);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
