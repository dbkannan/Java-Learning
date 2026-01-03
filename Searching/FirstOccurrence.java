/*
 * Problem: First and Last Occurrences
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

import java.util.*;

class Solution {
    public int[] firstAndLast(int[] arr, int x) {
        // Write your logic here
        // Return array with [first, last] indices
        // Return [-1, -1] if not found
        
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
            int[] result = obj.firstAndLast(arr, x);
            System.out.println(result[0] + " " + result[1]);
        }
        
        sc.close();
    }
}
