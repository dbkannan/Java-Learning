# Remove Duplicates from Sorted String

## 🎯 Concept Explanation

### What?
Given a **sorted** string, remove all duplicate characters keeping only the first occurrence. Example: "aabbcc" → "abc"

### Why do interviewers ask this?
- Tests understanding of **sorted data** optimization
- Foundation for **remove duplicates from sorted array**
- Checks string building efficiency (StringBuilder)
- Teaches difference between sorted vs unsorted duplicate removal
- Common pattern in preprocessing/data cleaning

### When to use?
- Deduplication on sorted data
- Preprocessing for unique character operations
- Compression algorithms
- Data cleaning and normalization

### Where does it fit in DSA?
- **Pattern:** Two Pointers / Single Pass on Sorted Data
- **Category:** Strings, Two Pointers
- **Foundation for:** Remove Duplicates from Array, Unique Paths

### How to apply?

**Key Insight:** Since string is sorted, duplicates are adjacent!

**Approach 1: StringBuilder (Optimal)**
1. Add first character to result
2. Traverse string from index 1
3. Add character only if different from previous
4. Return result

**Approach 2: Two Pointers (In-place for arrays)**
- Not directly applicable to strings (immutable in Java)
- But same concept works for arrays

---

## 📋 Problem Details

**Problem Name:** Remove Duplicates  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/remove-duplicates3034/1  
**Difficulty:** Easy  
**Category:** Strings, Two Pointers

### Constraints
- 1 ≤ s.length() ≤ 10^5
- String contains only lowercase English letters
- String is sorted in non-decreasing order

### Expected Complexity
- **Time Complexity:** O(n) - single pass
- **Space Complexity:** O(n) - for result string

---

## 📥 Input / Output

### Input Format
```
s = "aabbcc"
```

### Output Format
```
"abc"
```

### Sample Test Cases

#### Test Case 1
**Input:**  
```
s = "geeksforgeeks"
```
**Output:**  
```
"efgkors"
```
**Explanation:** After sorting, it becomes "eefggkkorss", removing duplicates gives "efgkors". (Note: GFG problem sorts first if not sorted)

#### Test Case 2
**Input:**  
```
s = "aabbcc"
```
**Output:**  
```
"abc"
```

#### Test Case 3
**Input:**  
```
s = "abcd"
```
**Output:**  
```
"abcd"
```
**Explanation:** No duplicates to remove.

#### Test Case 4
**Input:**  
```
s = "aaaa"
```
**Output:**  
```
"a"
```
**Explanation:** All same, keep only one.

---

## 💡 Interview Notes

### Edge Cases to Consider
1. **All same characters** → Return single character
2. **No duplicates** → Return original string
3. **Single character** → Return as is
4. **Empty string** → Return empty (though constraints say length ≥ 1)
5. **Two characters same** → Return single occurrence

### Common Mistakes
- ❌ Using Set (loses sorted order, O(n) space but wrong for sorted optimization)
- ❌ Using nested loops (O(n²) when O(n) is sufficient)
- ❌ String concatenation in loop (creates many objects - O(n²))
- ❌ Not taking advantage of "sorted" property
- ❌ Forgetting that strings are immutable in Java

### Optimization Ideas
- ✅ Single pass with StringBuilder is optimal
- ✅ Only compare with previous character (sorted property!)
- ✅ No need for HashSet since duplicates are adjacent
- 🔹 For unsorted: Would need Set - O(n) time, O(n) space

### Interview Talking Points
- "Since the string is sorted, all duplicates are adjacent"
- "I only need to compare each character with the previous one"
- "I'll use StringBuilder to avoid creating many string objects"
- "This is O(n) time with a single pass"

### Follow-up Questions You Might Get
1. **What if string is not sorted?** (Need HashSet, lose order or sort first)
2. **Remove duplicates from array in-place?** (Two pointers, return new length)
3. **Remove all adjacent duplicates?** (Stack-based approach)
4. **Keep only characters appearing exactly once?** (Need frequency count)
5. **What if we want to keep last occurrence?** (Traverse right-to-left or reverse)

---

## 🔗 Related Problems
- Remove Duplicates from Sorted Array
- Remove Duplicates from Sorted Array II
- Remove All Adjacent Duplicates in String
- Remove All Adjacent Duplicates in String II
- Unique Email Addresses

---

## 🎓 Multiple Approaches Comparison

| Approach | Time | Space | Applicable? | Notes |
|----------|------|-------|-------------|-------|
| StringBuilder | O(n) | O(n) | ✅ Best | Optimal for strings |
| String concat | O(n²) | O(n) | ❌ No | Creates many objects |
| HashSet | O(n) | O(n) | ❌ No | Doesn't preserve order |
| Two pointers in-place | O(n) | O(1) | ✅ For arrays | Not for Java strings |

---

## 💻 Code Approaches

### Approach 1: StringBuilder (Recommended for Strings)
```java
if (s == null || s.length() == 0) return s;

StringBuilder result = new StringBuilder();
result.append(s.charAt(0)); // Add first character

for (int i = 1; i < s.length(); i++) {
    // Only add if different from previous
    if (s.charAt(i) != s.charAt(i - 1)) {
        result.append(s.charAt(i));
    }
}

return result.toString();
```

### Approach 2: Character Array (More explicit)
```java
if (s == null || s.length() == 0) return s;

char[] chars = s.toCharArray();
StringBuilder result = new StringBuilder();
result.append(chars[0]);

for (int i = 1; i < chars.length; i++) {
    if (chars[i] != chars[i - 1]) {
        result.append(chars[i]);
    }
}

return result.toString();
```

### For Reference: Two Pointers (Array in-place)
```java
// This approach works for int[] or char[], not String in Java
// Returns new length, modifies array in-place
public int removeDuplicates(int[] arr) {
    if (arr.length == 0) return 0;
    
    int write = 1; // Position to write next unique element
    
    for (int read = 1; read < arr.length; read++) {
        if (arr[read] != arr[read - 1]) {
            arr[write] = arr[read];
            write++;
        }
    }
    
    return write; // New length
}
```

---

## 🧩 Problem Patterns

This demonstrates the **"Sorted Data Optimization"** pattern:
- When data is sorted, duplicates are adjacent
- Only need to compare with previous element
- O(1) lookup/comparison vs O(n) or O(log n) for unsorted
- Single pass solution
- Used in: Merge operations, duplicate removal, finding unique elements

---

## 🔄 Sorted vs Unsorted Comparison

| Aspect | Sorted | Unsorted |
|--------|--------|----------|
| Duplicate location | Adjacent | Anywhere |
| Comparison needed | Previous element only | All seen elements |
| Data structure | None (or StringBuilder) | HashSet required |
| Time Complexity | O(n) | O(n) but with Set overhead |
| Space Complexity | O(n) for result | O(n) result + O(n) Set |

---

## 💡 Key Takeaway

**Sorted data is a superpower!** When input is sorted, many O(n²) problems become O(n), and many problems requiring extra data structures can be solved with simple comparisons. Always check if input has special properties (sorted, distinct, bounded range, etc.) that enable optimizations.
