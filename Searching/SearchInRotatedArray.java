/*
 * Problem: Search in Rotated Sorted Array
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

import java.util.*;

class Solution {
    public int search(int[] arr, int target) {
        // Write your logic here
        
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
            
            int target = sc.nextInt();
            
            Solution obj = new Solution();
            System.out.println(obj.search(arr, target));
        }
        
        sc.close();
    }
}
