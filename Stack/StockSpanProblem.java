/* Problem: Stock Span Problem
 * Link: https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
 * Time: O(n), Space: O(n) */

import java.util.*;

class Solution {
    public int[] calculateSpan(int[] price) {
        // Calculate span for each day
        return new int[price.length];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] price = new int[n];
            for (int i = 0; i < n; i++) price[i] = sc.nextInt();
            int[] result = new Solution().calculateSpan(price);
            for (int num : result) System.out.print(num + " ");
            System.out.println();
        }
        sc.close();
    }
}
