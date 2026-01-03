/* Problem: First Negative in Every Window
 * Link: https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
 * Time: O(n), Space: O(k) */

import java.util.*;

class Solution {
    public long[] firstNegative(long[] arr, int k) {
        // Return first negative in each window of size k
        return new long[arr.length - k + 1];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
            int k = sc.nextInt();
            long[] result = new Solution().firstNegative(arr, k);
            for (long num : result) System.out.print(num + " ");
            System.out.println();
        }
        sc.close();
    }
}
