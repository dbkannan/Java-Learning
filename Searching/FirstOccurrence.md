# First and Last Occurrences

## 🎯 Concept

Find first and last positions of element in sorted array with duplicates.

### Why important?
- Binary search variation
- Boundary finding pattern
- Used in many problems

## 📋 Details

**Link:** https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1  
**Complexity:** O(log n) time

## 💻 Approach

Use two binary searches:
1. Find leftmost (first) occurrence
2. Find rightmost (last) occurrence

```java
public int[] firstAndLast(int[] arr, int x) {
    int first = findFirst(arr, x);
    if (first == -1) return new int[]{-1, -1};
    
    int last = findLast(arr, x);
    return new int[]{first, last};
}

private int findFirst(int[] arr, int x) {
    int left = 0, right = arr.length - 1;
    int result = -1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == x) {
            result = mid;
            right = mid - 1; // Continue searching left
        } else if (arr[mid] < x) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return result;
}

private int findLast(int[] arr, int x) {
    int left = 0, right = arr.length - 1;
    int result = -1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == x) {
            result = mid;
            left = mid + 1; // Continue searching right
        } else if (arr[mid] < x) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return result;
}
```
