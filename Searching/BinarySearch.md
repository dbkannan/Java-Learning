# Binary Search

## 🎯 Concept Explanation

### What?
Binary search is an efficient algorithm to find a target value in a **sorted** array by repeatedly dividing the search interval in half.

### Why do interviewers ask this?
- Fundamental O(log n) algorithm
- Gateway to advanced searching
- Tests understanding of sorted data optimization
- Foundation for many problems

### When to use?
- Searching in sorted arrays
- Finding boundaries (first/last occurrence)
- Optimization problems

### Where does it fit?
- **Pattern:** Divide and Conquer
- **Category:** Searching
- **Foundation for:** Rotated array search, peak element

### How to apply?
1. Set left = 0, right = n-1
2. While left <= right:
   - mid = left + (right - left) / 2
   - If arr[mid] == target: found!
   - If arr[mid] < target: search right half
   - Else: search left half
3. Return -1 if not found

---

## 📋 Problem Details

**Problem:** Binary Search  
**Link:** https://www.geeksforgeeks.org/problems/binary-search-1587115620/1  
**Difficulty:** Easy

### Constraints
- 1 ≤ n ≤ 10^5
- Array is sorted

### Expected Complexity
- **Time:** O(log n)
- **Space:** O(1)

---

## 📥 Input / Output

**Input:** `arr[] = [1, 2, 3, 4, 5], k = 3`  
**Output:** `2`  
**Explanation:** 3 is at index 2

---

## 💡 Interview Notes

### Edge Cases
- Empty array
- Single element
- Target at boundaries
- Target not present

### Common Mistakes
- ❌ mid = (left + right) / 2 (integer overflow!)
- ✅ mid = left + (right - left) / 2
- ❌ Using < instead of <=
- ❌ Infinite loop with wrong boundary updates

---

## 💻 Code

```java
public int binarySearch(int[] arr, int k) {
    int left = 0, right = arr.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == k) {
            return mid;
        } else if (arr[mid] < k) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return -1;
}
```

---

## 🔗 Related Problems
- Search in Rotated Sorted Array
- First and Last Occurrence
- Peak Element
- Square Root using Binary Search
