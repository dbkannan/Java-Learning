# Search in Rotated Sorted Array

## 🎯 Concept

Find element in rotated sorted array. Example: [4,5,6,7,0,1,2]

### Why important?
- Tests binary search variation
- Common in interviews
- Shows problem-solving creativity

## 📋 Details

**Link:** https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1  
**Complexity:** O(log n) time, O(1) space

## 💻 Approach

1. Find pivot using binary search
2. Determine which half is sorted
3. Search in appropriate half

```java
public int search(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) return mid;
        
        // Left half is sorted
        if (arr[left] <= arr[mid]) {
            if (target >= arr[left] && target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // Right half is sorted
        else {
            if (target > arr[mid] && target <= arr[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    
    return -1;
}
```
