/* Problem: Pair Sum Existence
 * Link: https://www.geeksforgeeks.org/problems/pair-sum-existence/1
 * Time: O(n), Space: O(1) for sorted array */

import java.util.*;

class Solution {
    public boolean pairSum(int[] arr, int target) {
        // Two pointers approach on sorted array
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
            System.out.println(new Solution().pairSum(arr, target));
        }
        sc.close();
    }
}
