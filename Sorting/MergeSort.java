/*
 * Problem: Merge Sort
 * GeeksForGeeks Link: https://www.geeksforgeeks.org/problems/merge-sort/1
 * Time Complexity: O(n log n), Space: O(n)
 */

import java.util.*;

class Solution {
    public void mergeSort(int[] arr, int left, int right) {
        // Write your logic here
    }
    
    private void merge(int[] arr, int left, int mid, int right) {
        // Write merge logic here
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            Solution obj = new Solution();
            obj.mergeSort(arr, 0, n - 1);
            
            for (int num : arr) System.out.print(num + " ");
            System.out.println();
        }
        sc.close();
    }
}
