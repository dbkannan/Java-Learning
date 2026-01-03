/* Problem: Remove Duplicates from Sorted Array
 * Link: https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
 * Time: O(n), Space: O(1) */

import java.util.*;

class Solution {
    public int removeDuplicates(int[] arr) {
        // Return new length after removing duplicates
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int newLen = new Solution().removeDuplicates(arr);
            for (int i = 0; i < newLen; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
        sc.close();
    }
}
