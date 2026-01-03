/*
 * Problem: Number of Occurrence
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

import java.util.*;

class Solution {
    public int count(int[] arr, int x) {
        // Write your logic here
        // Return count of occurrences of x
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int x = sc.nextInt();
            
            Solution obj = new Solution();
            System.out.println(obj.count(arr, x));
        }
        
        sc.close();
    }
}
