# Reverse a String

## 🎯 Concept Explanation

### What?
String reversal means creating a new string with characters in opposite order: first becomes last, second becomes second-to-last, etc.

### Why do interviewers ask this?
- Tests understanding of **string immutability** in Java
- Foundation for **two-pointer technique** on strings
- Checks knowledge of StringBuilder vs String
- Common substring/palindrome problem component
- Tests basic string manipulation skills

### When to use?
- Palindrome checking (compare with reverse)
- Text processing and formatting
- Cryptography/encoding problems
- As a subroutine in complex string algorithms

### Where does it fit in DSA?
- **Pattern:** Two Pointers, String Manipulation
- **Category:** Strings, Basic Algorithms
- **Foundation for:** Palindrome problems, word reversal, sentence reversal

### How to apply?

**Approach 1: Two Pointers (Character Array)**
1. Convert string to char array
2. Use left and right pointers
3. Swap characters while left < right
4. Convert back to string

**Approach 2: StringBuilder**
1. Use built-in `reverse()` method
2. Most efficient for Java

**Approach 3: Iterative (Building new string)**
1. Traverse from end to start
2. Append each character to result

---

## 📋 Problem Details

**Problem Name:** Reverse a String  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/reverse-a-string/1  
**Difficulty:** Easy  
**Category:** Strings

### Constraints
- 1 ≤ s.length() ≤ 10^5
- String contains only ASCII characters

### Expected Complexity
- **Time Complexity:** O(n) - must process every character
- **Space Complexity:** O(n) - new string/array needed

---

## 📥 Input / Output

### Input Format
```
s = "hello"
```

### Output Format
```
"olleh"
```

### Sample Test Cases

#### Test Case 1
**Input:**  
```
s = "geeksforgeeks"
```
**Output:**  
```
"skeegrofskeeg"
```

#### Test Case 2
**Input:**  
```
s = "a"
```
**Output:**  
```
"a"
```
**Explanation:** Single character remains same.

#### Test Case 3
**Input:**  
```
s = "ab"
```
**Output:**  
```
"ba"
```

---

## 💡 Interview Notes

### Edge Cases to Consider
1. **Empty string** → Return empty string
2. **Single character** → Return same character
3. **Palindrome** → Reverse equals original
4. **Spaces and special characters** → Treat like regular characters

### Common Mistakes
- ❌ Trying to modify String directly (Strings are immutable in Java!)
- ❌ Not using StringBuilder (concatenation in loop is O(n²))
- ❌ Forgetting to convert char[] back to String
- ❌ Index out of bounds with two pointers

### Optimization Ideas
- ✅ Use StringBuilder with reverse() - simplest and efficient
- ✅ Use char array with two pointers - in-place approach
- ❌ Avoid String concatenation in loops (creates many objects)
- 🔹 For very large strings, consider streaming approaches

### Java-Specific Notes
- **Strings are immutable** - cannot change characters in place
- StringBuilder is mutable and has `reverse()` method
- String concatenation with + creates new objects each time

### Interview Talking Points
- "I'll use StringBuilder since it has built-in reverse() method"
- "Alternative: Convert to char array and use two pointers"
- "Strings are immutable in Java, so I need a mutable structure"
- "StringBuilder is O(n) time and space, which is optimal"

### Follow-up Questions You Might Get
1. **Reverse words in a sentence?** (Split, reverse each, rejoin)
2. **Reverse without using extra space?** (Not possible with Java Strings - immutable)
3. **Reverse only letters, keep special chars in place?** (Two pointers with conditions)
4. **Check if string is palindrome?** (Reverse and compare)
5. **Reverse a number?** (Similar logic with integer operations)

---

## 🔗 Related Problems
- Valid Palindrome
- Reverse Words in a String
- Reverse String II
- Reverse Only Letters
- Palindrome Check

---

## 🎓 Multiple Approaches Comparison

| Approach | Time | Space | Code Length | Pros |
|----------|------|-------|-------------|------|
| StringBuilder.reverse() | O(n) | O(n) | 1 line | Simplest, built-in |
| Char array + Two Pointers | O(n) | O(n) | 10 lines | Educational, shows algorithm |
| String concatenation | O(n²) | O(n) | Simple | ❌ Inefficient, avoid! |
| Recursion | O(n) | O(n) | Short | Stack overhead |

---

## 💻 Code Approaches

### Approach 1: StringBuilder (Recommended)
```java
return new StringBuilder(s).reverse().toString();
```

### Approach 2: Character Array with Two Pointers
```java
char[] chars = s.toCharArray();
int left = 0, right = chars.length - 1;
while (left < right) {
    char temp = chars[left];
    chars[left] = chars[right];
    chars[right] = temp;
    left++;
    right--;
}
return new String(chars);
```

### Approach 3: Iterative Building
```java
StringBuilder sb = new StringBuilder();
for (int i = s.length() - 1; i >= 0; i--) {
    sb.append(s.charAt(i));
}
return sb.toString();
```

---

## 🧩 Problem Patterns

This problem teaches:
- **String Immutability** in Java
- **Two Pointer** technique on linear data
- **StringBuilder** usage for efficient string building
- Foundation for all string manipulation problems

---

## 🎯 Key Takeaway

In Java, Strings are immutable. For string manipulation, use:
- **StringBuilder** for building/modifying strings
- **char[]** for character-level operations
- Never use `+` in loops (creates many intermediate objects)
