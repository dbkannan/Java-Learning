/* Problem: Container With Most Water
 * Link: https://www.geeksforgeeks.org/problems/container-with-most-water0535/1
 * Time: O(n), Space: O(1) */

import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        // Return maximum water that can be contained
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] height = new int[n];
            for (int i = 0; i < n; i++) height[i] = sc.nextInt();
            System.out.println(new Solution().maxArea(height));
        }
        sc.close();
    }
}
