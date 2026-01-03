# First Non-Repeating Character

## 🎯 Concept Explanation

### What?
Find the first character in a string that appears exactly once. If all characters repeat, return '$'. Example: In "geeksforgeeks", 'f' is the first non-repeating character.

### Why do interviewers ask this?
- Tests **frequency counting** with ordering constraint
- Checks understanding of **first occurrence** vs frequency
- Teaches importance of maintaining insertion order
- Common pattern in stream processing problems
- Tests ability to combine multiple data structures

### When to use?
- Finding unique elements while preserving order
- Stream processing (characters arriving one by one)
- Data deduplication with order preservation
- Queue-based problems

### Where does it fit in DSA?
- **Pattern:** Frequency Counting + Order Preservation
- **Category:** Strings, Hashing, Queue
- **Foundation for:** First Unique Character in Stream, LRU Cache patterns

### How to apply?

**Approach 1: Two Pass (Array/HashMap)**
1. **First pass:** Count frequency of each character
2. **Second pass:** Find first character with count = 1

**Approach 2: LinkedHashMap** (Preserves insertion order)
1. Store characters with their frequencies maintaining order
2. Iterate through map to find first with count = 1

**Key Insight:** Need TWO things - frequency AND order!

---

## 📋 Problem Details

**Problem Name:** Non Repeating Character  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1  
**Difficulty:** Easy  
**Category:** Strings, Hashing

### Constraints
- 1 ≤ s.length() ≤ 10^5
- String contains only lowercase English letters

### Expected Complexity
- **Time Complexity:** O(n) - two passes through string
- **Space Complexity:** O(1) - fixed array size (26 letters)

---

## 📥 Input / Output

### Input Format
```
s = "geeksforgeeks"
```

### Output Format
```
'f'
```

### Sample Test Cases

#### Test Case 1
**Input:**  
```
s = "geeksforgeeks"
```
**Output:**  
```
'f'
```
**Explanation:** 'f' appears once and is the first such character.

#### Test Case 2
**Input:**  
```
s = "hello"
```
**Output:**  
```
'h'
```
**Explanation:** 'h' appears once and comes first.

#### Test Case 3
**Input:**  
```
s = "aabb"
```
**Output:**  
```
'$'
```
**Explanation:** All characters repeat.

#### Test Case 4
**Input:**  
```
s = "a"
```
**Output:**  
```
'a'
```
**Explanation:** Single character is non-repeating.

---

## 💡 Interview Notes

### Edge Cases to Consider
1. **All characters repeat** → Return '$'
2. **Single character** → That character is non-repeating
3. **All characters unique** → Return first character
4. **Non-repeating at end** → Must scan entire string twice
5. **Empty string** → Return '$' (though constraints say length ≥ 1)

### Common Mistakes
- ❌ Returning first unique in frequency map (loses order!)
- ❌ Using only one pass (need to count first, then find)
- ❌ Not maintaining original order of characters
- ❌ Using Set (doesn't track frequency)
- ❌ Returning last non-repeating instead of first

### Optimization Ideas
- ✅ Use int[26] for lowercase letters (faster than HashMap)
- ✅ Two-pass solution is optimal for this problem
- 🔹 For streaming: Use queue + frequency map (different problem)
- 🔹 LinkedHashMap maintains insertion order automatically

### Interview Talking Points
- "I need to track both frequency AND order"
- "I'll do two passes: first to count, second to find first with count 1"
- "Using an array is faster than HashMap for lowercase letters"
- "Second pass through original string maintains order"

### Follow-up Questions You Might Get
1. **Stream version: Characters arrive one by one?** (Queue + HashMap)
2. **What if we need all non-repeating characters?** (Same approach, collect all)
3. **Find first repeating character?** (Opposite condition)
4. **Kth non-repeating character?** (Continue counting)
5. **Handle case insensitive?** (Convert to same case first)

---

## 🔗 Related Problems
- First Unique Character in a Stream
- First Repeating Element
- Remove All Adjacent Duplicates
- Sort Characters by Frequency
- Longest Substring Without Repeating Characters

---

## 🎓 Multiple Approaches Comparison

| Approach | Time | Space | Pros | Cons |
|----------|------|-------|------|------|
| Two Pass + int[26] | O(n) | O(1) | ✅ Optimal, fastest | Only lowercase a-z |
| Two Pass + HashMap | O(n) | O(n) | Works for any chars | Slightly slower |
| LinkedHashMap | O(n) | O(n) | Single structure | More complex |
| Single Pass Wrong | ❌ | ❌ | - | Doesn't work! |

---

## 💻 Code Approaches

### Approach 1: Two Pass with Array (Optimal)
```java
// First pass: Count frequencies
int[] count = new int[26];
for (char c : s.toCharArray()) {
    count[c - 'a']++;
}

// Second pass: Find first with count = 1
for (char c : s.toCharArray()) {
    if (count[c - 'a'] == 1) {
        return c;
    }
}

return '$'; // No non-repeating character
```

### Approach 2: LinkedHashMap
```java
Map<Character, Integer> map = new LinkedHashMap<>();

// Count frequencies (order preserved)
for (char c : s.toCharArray()) {
    map.put(c, map.getOrDefault(c, 0) + 1);
}

// Find first with count = 1
for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    if (entry.getValue() == 1) {
        return entry.getKey();
    }
}

return '$';
```

### Approach 3: Two Pass with HashMap
```java
Map<Character, Integer> map = new HashMap<>();

// First pass: count
for (char c : s.toCharArray()) {
    map.put(c, map.getOrDefault(c, 0) + 1);
}

// Second pass through original string (maintains order!)
for (char c : s.toCharArray()) {
    if (map.get(c) == 1) {
        return c;
    }
}

return '$';
```

---

## 🧩 Problem Patterns

This problem demonstrates the **"Frequency + Order"** pattern:
- Need to count occurrences
- Also need to preserve or track order
- Two-pass solution: Count, then find in order
- Cannot be done in single pass for this variant
- Used in: Unique characters, deduplication with order

---

## 🎯 Why Two Passes?

**Can't we do it in one pass?**
No! Consider "aabbcd":
- When you see 'c', you don't know if it repeats later
- Need full frequency count before making decisions

**Exception:** Streaming version uses different approach (queue + hashmap)

---

## 💡 Key Takeaway

When you need both **frequency information** and **order preservation**, a two-pass solution is often necessary:
1. First pass: Gather complete frequency data
2. Second pass: Process in original order using frequency info

This pattern appears in many interview problems!
