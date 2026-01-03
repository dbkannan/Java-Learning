/* Problem: Frequency of Array Elements
 * Link: https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0
 * Time: O(n), Space: O(n) */

import java.util.*;

class Solution {
    public void frequencyCount(int[] arr) {
        // Write your logic here - count frequency of each element
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            new Solution().frequencyCount(arr);
            for (int num : arr) System.out.print(num + " ");
            System.out.println();
        }
        sc.close();
    }
}
