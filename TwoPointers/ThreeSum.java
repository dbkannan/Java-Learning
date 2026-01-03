/* Problem: Triplet Sum in Array
 * Link: https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1
 * Time: O(n^2), Space: O(1) */

import java.util.*;

class Solution {
    public boolean threeSum(int[] arr, int target) {
        // Return true if triplet exists with given sum
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int target = sc.nextInt();
            System.out.println(new Solution().threeSum(arr, target));
        }
        sc.close();
    }
}
