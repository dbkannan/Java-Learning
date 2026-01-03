/*
 * Problem: Reverse a String
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/reverse-a-string/1
 * 
 * Time Complexity: O(n) - where n is the length of the string
 * Space Complexity: O(n) - for creating new string/array
 * 
 * Input Format: A string s
 * Output Format: The reversed string
 */

import java.util.*;

class Solution {
    // Function to reverse a string
    public String reverseString(String s) {
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
            
            // Create solution object and reverse string
            Solution obj = new Solution();
            String result = obj.reverseString(s);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
