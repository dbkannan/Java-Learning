/*
 * Problem: Anagram
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/anagram-1587115620/1
 * 
 * Time Complexity: O(n) - where n is the length of strings
 * Space Complexity: O(1) - fixed size array for 26 letters (or O(n) for HashMap)
 * 
 * Input Format: Two strings s1 and s2
 * Output Format: true if anagrams, false otherwise
 * 
 * Note: Anagrams have same characters with same frequency, just rearranged
 */

import java.util.*;

class Solution {
    // Function to check if two strings are anagrams
    // Anagrams contain same characters with same frequencies
    public boolean isAnagram(String s1, String s2) {
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
            // Read two strings
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            
            // Create solution object and check anagram
            Solution obj = new Solution();
            boolean result = obj.isAnagram(s1, s2);
            
            // Print result
            System.out.println(result);
        }
        
        sc.close();
    }
}
