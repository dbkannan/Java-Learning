/*
 * Problem: Palindrome String
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/palindrome-string0817/1
 * 
 * Time Complexity: O(n) - where n is the length of the string
 * Space Complexity: O(1) - only using pointers, no extra space
 * 
 * Input Format: A string s
 * Output Format: true if palindrome, false otherwise
 */

import java.util.*;

class Solution {
    // Function to check if a string is a palindrome
    // A palindrome reads the same forwards and backwards
    public boolean isPalindrome(String s) {
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
            
            // Create solution object and check palindrome
            Solution obj = new Solution();
            boolean result = obj.isPalindrome(s);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
