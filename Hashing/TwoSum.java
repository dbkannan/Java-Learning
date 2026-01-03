/* Problem: Two Sum (Key Pair)
 * Link: https://www.geeksforgeeks.org/problems/key-pair5616/1
 * Time: O(n), Space: O(n) */

import java.util.*;

class Solution {
    public boolean twoSum(int[] arr, int target) {
        // Return true if pair exists with given sum
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
            System.out.println(new Solution().twoSum(arr, target));
        }
        sc.close();
    }
}
