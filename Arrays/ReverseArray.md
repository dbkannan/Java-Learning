# Reverse an Array

## 🎯 Concept Explanation

### What?
Array reversal is the fundamental operation of reversing the order of elements in an array - the first element becomes the last, the second becomes second-to-last, and so on.

### Why do interviewers ask this?
- Tests understanding of **array indexing** and **pointer manipulation**
- Foundation for more complex two-pointer problems
- Checks ability to modify data structures **in-place** (space optimization)
- Common sub-problem in many interview questions

### When to use?
- When you need elements in reverse order
- As part of rotation algorithms
- In palindrome checking
- String/array manipulation problems

### Where does it fit in DSA?
- **Pattern:** Two Pointers (left and right pointer approaching center)
- **Category:** Array Manipulation
- **Foundation for:** String reversal, rotation, palindrome checks

### How to apply?
1. Use two pointers: one at start (left), one at end (right)
2. Swap elements at left and right
3. Move left forward, right backward
4. Continue until left >= right

---

## 📋 Problem Details

**Problem Name:** Reverse an Array  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/reverse-an-array/1  
**Difficulty:** Easy  
**Category:** Arrays, Two Pointers

### Constraints
- 1 ≤ arr.size() ≤ 10^5
- 1 ≤ arr[i] ≤ 10^6

### Expected Complexity
- **Time Complexity:** O(n) - visit each element once
- **Space Complexity:** O(1) - no extra space, in-place reversal

---

## 📥 Input / Output

### Input Format
```
arr[] = [1, 2, 3, 4, 5]
```

### Output Format
```
[5, 4, 3, 2, 1]
```

### Sample Test Cases

#### Test Case 1
**Input:**  
```
arr[] = [1, 4, 3, 2, 6, 5]
```
**Output:**  
```
[5, 6, 2, 3, 4, 1]
```
**Explanation:** The array is reversed element by element.

#### Test Case 2
**Input:**  
```
arr[] = [4, 5, 2]
```
**Output:**  
```
[2, 5, 4]
```

#### Test Case 3
**Input:**  
```
arr[] = [1]
```
**Output:**  
```
[1]
```
**Explanation:** Single element array remains unchanged.

---

## 💡 Interview Notes

### Edge Cases to Consider
1. **Empty array** - Handle gracefully (though constraints say size ≥ 1)
2. **Single element** - Already "reversed", no swap needed
3. **Two elements** - Single swap
4. **Even vs Odd length** - Both work with same logic (left < right condition handles both)

### Common Mistakes
- ❌ Creating a new array (violates O(1) space requirement)
- ❌ Not stopping at the middle (causes double reversal)
- ❌ Index out of bounds when not checking left < right
- ❌ Using left <= right instead of left < right (middle element gets swapped with itself unnecessarily)

### Optimization Ideas
- ✅ This is already optimal - O(n) time, O(1) space
- ✅ Can't do better than O(n) as you must visit each element

### Interview Talking Points
- "I'll use two pointers to avoid extra space"
- "This takes linear time because we swap n/2 pairs"
- "The condition left < right automatically handles both even and odd length arrays"

### Follow-up Questions You Might Get
1. Can you reverse only a subarray from index i to j?
2. Can you reverse an array recursively?
3. What if the array is very large and doesn't fit in memory?
4. How would you reverse a linked list? (Different approach needed!)

---

## 🔗 Related Problems
- Rotate Array
- Palindrome Check
- Reverse String
- Reverse Words in a String
