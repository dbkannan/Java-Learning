# Palindrome String

## 🎯 Concept Explanation

### What?
A palindrome is a string that reads the same forwards and backwards. Examples: "racecar", "madam", "noon". We need to check if a given string is a palindrome.

### Why do interviewers ask this?
- Tests **two-pointer technique** understanding
- Foundation for many string problems
- Checks ability to optimize (don't reverse, just compare)
- Common in first rounds and phone screens
- Tests edge case handling (empty, single char, spaces, case)

### When to use?
- String validation problems
- Detecting symmetric patterns
- Data structure problems (linked list palindrome)
- Substring problems (longest palindromic substring)

### Where does it fit in DSA?
- **Pattern:** Two Pointers (Meeting in the Middle)
- **Category:** Strings, Two Pointers
- **Foundation for:** Longest Palindromic Substring, Valid Palindrome II

### How to apply?

**Optimal Approach: Two Pointers**
1. Use left pointer at start, right pointer at end
2. Compare characters at both pointers
3. If different → not palindrome
4. Move left forward, right backward
5. Continue until left >= right → palindrome!

**Key Insight:** No need to reverse - just compare from both ends!

---

## 📋 Problem Details

**Problem Name:** Palindrome String  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/palindrome-string0817/1  
**Difficulty:** Easy  
**Category:** Strings, Two Pointers

### Constraints
- 1 ≤ s.length() ≤ 10^5
- String may contain letters, digits, spaces, special characters

### Expected Complexity
- **Time Complexity:** O(n) - check half the string
- **Space Complexity:** O(1) - no extra space needed

---

## 📥 Input / Output

### Input Format
```
s = "racecar"
```

### Output Format
```
true
```

### Sample Test Cases

#### Test Case 1
**Input:**  
```
s = "racecar"
```
**Output:**  
```
true
```
**Explanation:** Reads same forwards and backwards.

#### Test Case 2
**Input:**  
```
s = "hello"
```
**Output:**  
```
false
```
**Explanation:** "hello" ≠ "olleh"

#### Test Case 3
**Input:**  
```
s = "a"
```
**Output:**  
```
true
```
**Explanation:** Single character is always palindrome.

#### Test Case 4
**Input:**  
```
s = "noon"
```
**Output:**  
```
true
```

---

## 💡 Interview Notes

### Edge Cases to Consider
1. **Empty string** → Typically considered palindrome
2. **Single character** → Always palindrome
3. **Two characters same** → Palindrome
4. **Two characters different** → Not palindrome
5. **Even vs odd length** → Algorithm handles both
6. **Case sensitivity** → "Aa" - is it palindrome? (Depends on requirements)
7. **Spaces/special chars** → "A man a plan a canal Panama" (needs preprocessing)

### Common Mistakes
- ❌ Reversing the string (wastes space, O(n) space)
- ❌ Not handling case sensitivity when required
- ❌ Not ignoring non-alphanumeric when required
- ❌ Using left <= right instead of left < right (middle char compared with itself)

### Optimization Ideas
- ✅ Two pointers is optimal: O(n/2) comparisons, O(1) space
- ✅ Can stop early if mismatch found
- 🔹 For case-insensitive: convert to lowercase first
- 🔹 For alphanumeric only: skip non-alphanumeric characters

### Interview Talking Points
- "I'll use two pointers from both ends to avoid extra space"
- "This is O(n) time but only checks half the string"
- "No need to reverse - comparing from ends is sufficient"
- "If any mismatch found, I can return false immediately"

### Follow-up Questions You Might Get
1. **Make it case-insensitive?** (Convert to lower, or use equalsIgnoreCase logic)
2. **Ignore spaces and punctuation?** (Skip non-alphanumeric characters)
3. **Find longest palindromic substring?** (DP or expand around center)
4. **Valid Palindrome II: Remove one character?** (Recursion with one chance)
5. **Check if linked list is palindrome?** (Different approach - reverse half)

---

## 🔗 Related Problems
- Valid Palindrome (with preprocessing)
- Valid Palindrome II (remove at most one char)
- Longest Palindromic Substring
- Palindromic Substrings (Count all)
- Palindrome Linked List

---

## 🎓 Multiple Approaches Comparison

| Approach | Time | Space | When to Use |
|----------|------|-------|-------------|
| Two Pointers | O(n) | O(1) | ✅ Always - optimal |
| Reverse & Compare | O(n) | O(n) | Only if reverse already needed |
| Recursion | O(n) | O(n) | Educational, shows recursion |

---

## 💻 Code Approaches

### Approach 1: Two Pointers (Optimal)
```java
int left = 0, right = s.length() - 1;
while (left < right) {
    if (s.charAt(left) != s.charAt(right)) {
        return false;
    }
    left++;
    right--;
}
return true;
```

### Approach 2: Reverse and Compare
```java
String reversed = new StringBuilder(s).reverse().toString();
return s.equals(reversed);
```

### Approach 3: Recursive
```java
boolean isPalindromeHelper(String s, int left, int right) {
    if (left >= right) return true;
    if (s.charAt(left) != s.charAt(right)) return false;
    return isPalindromeHelper(s, left + 1, right - 1);
}
```

---

## 🧩 Advanced Variations

### Valid Palindrome (Case-insensitive, alphanumeric only)
```java
int left = 0, right = s.length() - 1;
while (left < right) {
    // Skip non-alphanumeric from left
    while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        left++;
    }
    // Skip non-alphanumeric from right
    while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
        right--;
    }
    // Compare (case-insensitive)
    if (Character.toLowerCase(s.charAt(left)) != 
        Character.toLowerCase(s.charAt(right))) {
        return false;
    }
    left++;
    right--;
}
return true;
```

---

## 🎯 Problem Patterns

This problem demonstrates the **"Two Pointers - Meeting in Middle"** pattern:
- Compare elements from both ends moving towards center
- Works for symmetry checking
- O(1) space solution
- Can short-circuit on first mismatch
- Used in: Palindrome, Container with Most Water, Reverse problems

---

## 💡 Key Takeaway

**Don't reverse when you can compare!** Two pointers meeting in the middle is often better than creating reversed copies - same time complexity, but O(1) space instead of O(n).
