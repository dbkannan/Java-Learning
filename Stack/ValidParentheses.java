/* Problem: Valid Parentheses
 * Link: https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
 * Time: O(n), Space: O(n) */

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        // Check if parentheses are balanced
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(new Solution().isValid(s));
        }
        sc.close();
    }
}
