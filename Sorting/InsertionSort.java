/*
 * Problem: Insertion Sort
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/insertion-sort/1
 * Time Complexity: O(n^2), Space: O(1)
 */

import java.util.*;

class Solution {
    public void insertionSort(int[] arr) {
        // Write your logic here
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            Solution obj = new Solution();
            obj.insertionSort(arr);
            
            for (int num : arr) System.out.print(num + " ");
            System.out.println();
        }
        sc.close();
    }
}
