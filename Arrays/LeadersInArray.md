# Leaders in an Array

## 🎯 Concept Explanation

### What?
An element is called a **leader** if it is **greater than or equal to all elements to its right**. The rightmost element is always a leader. Find all such leaders.

### Why do interviewers ask this?
- Tests **reverse traversal** thinking
- Checks ability to maintain **running maximum**
- Demonstrates optimization from O(n²) to O(n)
- Common pattern: "look ahead" → "look back" transformation
- Tests array manipulation and result building

### When to use?
- When comparison depends on elements to the right
- "Greater than all elements after" type problems
- Next Greater Element variations
- Stock span, trapping water problems

### Where does it fit in DSA?
- **Pattern:** Right-to-Left Traversal with Running Max
- **Category:** Arrays, Greedy
- **Foundation for:** Next Greater Element, Stock Span Problem

### How to apply?

**Naive Approach:** O(n²)
- For each element, check all elements to its right

**Optimal Approach:** O(n)
1. Traverse from **right to left**
2. Keep track of **max seen so far** from right
3. If current element ≥ max, it's a leader
4. Update max and add to result
5. Reverse result (or use stack/insert at beginning)

**Key Insight:** By going right-to-left, we already know the maximum to the right!

---

## 📋 Problem Details

**Problem Name:** Leaders in an Array  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1  
**Difficulty:** Easy  
**Category:** Arrays, Greedy

### Constraints
- 1 ≤ arr.size() ≤ 10^7
- 0 ≤ arr[i] ≤ 10^7

### Expected Complexity
- **Time Complexity:** O(n) - single pass
- **Space Complexity:** O(n) - for storing result

---

## 📥 Input / Output

### Input Format
```
arr[] = [16, 17, 4, 3, 5, 2]
```

### Output Format
```
[17, 5, 2]
```

### Sample Test Cases

#### Test Case 1
**Input:**  
```
arr[] = [16, 17, 4, 3, 5, 2]
```
**Output:**  
```
[17, 5, 2]
```
**Explanation:**
- 17 is greater than all elements to its right
- 5 is greater than all elements to its right (only 2)
- 2 is the rightmost element (always a leader)

#### Test Case 2
**Input:**  
```
arr[] = [1, 2, 3, 4, 5]
```
**Output:**  
```
[5]
```
**Explanation:** Only the last element is a leader (ascending array).

#### Test Case 3
**Input:**  
```
arr[] = [5, 4, 3, 2, 1]
```
**Output:**  
```
[5, 4, 3, 2, 1]
```
**Explanation:** All elements are leaders (descending array).

#### Test Case 4
**Input:**  
```
arr[] = [7, 10, 4, 10, 6, 5, 2]
```
**Output:**  
```
[10, 10, 6, 5, 2]
```

---

## 💡 Interview Notes

### Edge Cases to Consider
1. **Single element** → That element is the leader
2. **All ascending** → Only last element is leader
3. **All descending** → All elements are leaders
4. **Duplicates** → Handle with >= comparison
5. **All elements same** → All are leaders

### Common Mistakes
- ❌ Using nested loops (O(n²) instead of O(n))
- ❌ Traversing left-to-right (requires looking ahead each time)
- ❌ Using < instead of <= (duplicates should be leaders too)
- ❌ Forgetting to maintain result in original order
- ❌ Forgetting that rightmost is always a leader

### Optimization Ideas
- ✅ Right-to-left traversal: Know max to right already
- ✅ Use Collections.reverse() or build result backwards
- 🔹 Can use stack if you want to avoid reversing
- 🔹 Can use LinkedList and addFirst() for O(1) insertion at beginning

### Interview Talking Points
- "I'll traverse from right to left to know the maximum ahead"
- "The rightmost element is always a leader by definition"
- "I'll track the maximum seen so far from the right"
- "I need to reverse the result at the end for correct order"

### Follow-up Questions You Might Get
1. **What if we need leaders from the left?** (Opposite logic)
2. **Find leaders using only one pass left-to-right?** (Possible with stack)
3. **What if array is very large?** (Same approach, space-efficient)
4. **Can you do this without extra space?** (In-place overwrite possible)
5. **Related: Next Greater Element?** (Similar pattern with stack)

---

## 🔗 Related Problems
- Next Greater Element
- Stock Span Problem
- Trapping Rain Water
- Daily Temperatures
- Maximum Element in Each Subarray

---

## 🎓 Multiple Approaches

### Approach 1: Brute Force - O(n²)
```
For each element arr[i]:
    Check if arr[i] >= all elements from i+1 to n-1
    If yes, add to result
```

### Approach 2: Optimal - O(n)
```
maxFromRight = Integer.MIN_VALUE
result = new ArrayList()
Traverse from right to left (i = n-1 to 0):
    if arr[i] >= maxFromRight:
        add arr[i] to result
        maxFromRight = arr[i]
Reverse result
return result
```

---

## 🧩 Problem Patterns

This problem teaches the **"Right-to-Left Traversal"** pattern:
- When you need to know "all elements after current"
- Maintain running maximum/minimum from right
- Transforms O(n²) look-ahead to O(n) with reverse scan
- Common in: Leaders, Next Greater, Stock problems

---

## 💻 Algorithm Visualization

```
Array: [16, 17, 4, 3, 5, 2]
           ↑
Start from right, traverse left

Step 1: arr[5] = 2, max = -∞ → 2 >= -∞ → Leader! max = 2
Step 2: arr[4] = 5, max = 2  → 5 >= 2  → Leader! max = 5
Step 3: arr[3] = 3, max = 5  → 3 < 5   → Not leader
Step 4: arr[2] = 4, max = 5  → 4 < 5   → Not leader
Step 5: arr[1] = 17, max = 5 → 17 >= 5 → Leader! max = 17
Step 6: arr[0] = 16, max = 17 → 16 < 17 → Not leader

Leaders found (reverse order): [2, 5, 17]
After reversal: [17, 5, 2]
```

---

## 🎯 Key Takeaway

**Direction of traversal matters!** Going right-to-left lets us track what's ahead efficiently, converting a quadratic problem into linear time.
