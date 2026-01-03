/* Problem: Subarray with 0 Sum
 * Link: https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
 * Time: O(n), Space: O(n) */

import java.util.*;

class Solution {
    public boolean subarrayWithZeroSum(int[] arr) {
        // Return true if subarray with sum 0 exists
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(new Solution().subarrayWithZeroSum(arr));
        }
        sc.close();
    }
}
