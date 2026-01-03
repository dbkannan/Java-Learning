# Three Sum

**Link:** https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1  
**Pattern:** Sorting + Two Pointers  
**Complexity:** O(n²) time, O(1) space

```java
public boolean threeSum(int[] arr, int target) {
    Arrays.sort(arr);
    
    for (int i = 0; i < arr.length - 2; i++) {
        int left = i + 1, right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[i] + arr[left] + arr[right];
            if (sum == target) return true;
            else if (sum < target) left++;
            else right--;
        }
    }
    
    return false;
}
```
