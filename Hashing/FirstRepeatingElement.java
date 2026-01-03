/* Problem: First Repeating Element
 * Link: https://www.geeksforgeeks.org/problems/first-repeating-element4018/1
 * Time: O(n), Space: O(n) */

import java.util.*;

class Solution {
    public int firstRepeating(int[] arr) {
        // Return index (1-based) of first repeating element, -1 if none
return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(new Solution().firstRepeating(arr));
        }
        sc.close();
    }
}
