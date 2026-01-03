# Find Missing Number in Array

## 🎯 Concept Explanation

### What?
Given an array containing n-1 distinct integers from the range 1 to n, find the one missing number. This is a classic problem demonstrating mathematical properties.

### Why do interviewers ask this?
- Tests **mathematical thinking** (sum formula)
- Checks ability to find **optimal solutions** (avoiding brute force)
- Teaches multiple approaches (sum, XOR, index-based)
- Common in phone screens and first rounds
- Tests understanding of **integer overflow** considerations

### When to use?
- When elements form a known sequence/range
- Problems involving **expected vs actual** comparisons
- Detecting anomalies in sequential data
- Checksum/validation scenarios

### Where does it fit in DSA?
- **Pattern:** Mathematical Problem Solving
- **Category:** Arrays, Math, Bit Manipulation
- **Foundation for:** Finding duplicate, finding two missing numbers

### How to apply?

**Approach 1: Sum Formula** (Recommended)
1. Calculate expected sum: sum = n * (n + 1) / 2
2. Calculate actual sum of array elements
3. Missing number = expected sum - actual sum

**Approach 2: XOR** (Bit Manipulation)
1. XOR all numbers from 1 to n
2. XOR all array elements
3. Result is the missing number (a ⊕ a = 0, a ⊕ 0 = a)

---

## 📋 Problem Details

**Problem Name:** Missing Number in Array  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1  
**Difficulty:** Easy  
**Category:** Arrays, Math, Bit Manipulation

### Constraints
- 1 ≤ n ≤ 10^5
- 1 ≤ arr[i] ≤ n
- Array contains n-1 distinct elements

### Expected Complexity
- **Time Complexity:** O(n) - single traversal
- **Space Complexity:** O(1) - constant space

---

## 📥 Input / Output

### Input Format
```
n = 5
arr[] = [1, 2, 3, 5]
```

### Output Format
```
4
```

### Sample Test Cases

#### Test Case 1
**Input:**  
```
n = 5
arr[] = [1, 2, 3, 5]
```
**Output:**  
```
4
```
**Explanation:** Numbers from 1 to 5, missing 4.

#### Test Case 2
**Input:**  
```
n = 10
arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 10]
```
**Output:**  
```
9
```
**Explanation:** 9 is missing from the sequence.

#### Test Case 3
**Input:**  
```
n = 2
arr[] = [1]
```
**Output:**  
```
2
```
**Explanation:** Only 1 is present, 2 is missing.

---

## 💡 Interview Notes

### Edge Cases to Consider
1. **Missing number is 1** (first number)
2. **Missing number is n** (last number)
3. **Array has only one element** (n = 2)
4. **Large n** → Watch for integer overflow with sum approach

### Common Mistakes
- ❌ Using extra space (set/hash map) when O(1) is possible
- ❌ Not considering integer overflow for large n
- ❌ Sorting the array (O(n log n) when O(n) is sufficient)
- ❌ Using nested loops (O(n²) brute force)

### Optimization Ideas
- ✅ **Sum approach:** Simple, intuitive, but watch for overflow
- ✅ **XOR approach:** No overflow issues, slightly less intuitive
- 🔹 Use `long` for sum calculation if n is large
- 🔹 XOR is overflow-safe: `xor ^= i` and `xor ^= arr[i]`

### Interview Talking Points
- "I'll use the sum formula: sum of 1 to n is n*(n+1)/2"
- "I'll subtract the actual sum from expected sum to find the missing number"
- "For large n, I'll use long to avoid overflow"
- "Alternative: XOR approach eliminates overflow concerns"

### Follow-up Questions You Might Get
1. **What if two numbers are missing?** (More complex - need sum and sum of squares)
2. **What if one number appears twice?** (XOR approach works)
3. **What if the range doesn't start from 1?** (Adjust formula)
4. **Can you handle overflow without long?** (Use XOR)
5. **What if array is very large and doesn't fit in memory?** (Streaming with XOR)

---

## 🔗 Related Problems
- Find Duplicate Number
- Find Two Missing Numbers
- First Missing Positive
- Missing Ranges
- Single Number (XOR pattern)

---

## 🎓 Multiple Approaches Comparison

| Approach | Time | Space | Pros | Cons |
|----------|------|-------|------|------|
| Sum Formula | O(n) | O(1) | Simple, intuitive | Overflow risk |
| XOR | O(n) | O(1) | No overflow | Less intuitive |
| Sorting | O(n log n) | O(1) | Easy to understand | Too slow |
| Hash Set | O(n) | O(n) | Straightforward | Extra space |

---

## 🧩 Problem Patterns

This problem demonstrates the **"Expected vs Actual"** pattern:
- Know what should be present (mathematical formula)
- Calculate what is actually present (array traversal)
- Difference reveals the anomaly
- Used in: Missing number, duplicate finding, array manipulation

---

## 💻 Code Approach Guide

### Sum Approach (Recommended for beginners)
```
expectedSum = n * (n + 1) / 2
actualSum = sum of all elements in arr
return expectedSum - actualSum
```

### XOR Approach (Overflow-safe)
```
xor = 0
for i from 1 to n: xor ^= i
for each element in arr: xor ^= element
return xor
```
