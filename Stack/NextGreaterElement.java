/* Problem: Next Greater Element
 * Link: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
 * Time: O(n), Space: O(n) */

import java.util.*;

class Solution {
    public int[] nextGreater(int[] arr) {
        // Return array with next greater elements
        return new int[arr.length];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int[] result = new Solution().nextGreater(arr);
            for (int num : result) System.out.print(num + " ");
            System.out.println();
        }
        sc.close();
    }
}
