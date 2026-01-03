# Count Occurrences

## 🎯 Concept

Count occurrences of element in sorted array using binary search.

## 📋 Details

**Link:** https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1  
**Complexity:** O(log n)

## 💻 Approach

Find first and last occurrence, count = last - first + 1

```java
public int count(int[] arr, int x) {
    int first = findFirst(arr, x);
    if (first == -1) return 0;
    
    int last = findLast(arr, x);
    return last - first + 1;
}
```
