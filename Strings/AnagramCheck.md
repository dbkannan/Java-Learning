# Anagram Check

## 🎯 Concept Explanation

### What?
Two strings are **anagrams** if they contain the exact same characters with the same frequencies, just rearranged. Example: "listen" and "silent", "evil" and "vile".

### Why do interviewers ask this?
- Tests understanding of **frequency counting**
- Foundation for hash map/array usage
- Checks ability to compare data structures
- Common pattern in grouping problems
- Tests optimization thinking (sorting vs counting)

### When to use?
- Checking if strings are rearrangements
- Grouping anagrams together
- Word game implementations (Scrabble, etc.)
- Cryptography/encoding validation

### Where does it fit in DSA?
- **Pattern:** Frequency Counting, Hashing
- **Category:** Strings, Hash Table
- **Foundation for:** Group Anagrams, Find All Anagrams in String

### How to apply?

**Approach 1: Sorting** (Simple but slower)
1. Sort both strings
2. Compare if sorted versions are equal

**Approach 2: Frequency Count** (Optimal)
1. If lengths differ → not anagrams
2. Count frequency of each character in both strings
3. Compare frequency maps

**Approach 3: Single Frequency Array** (Most efficient)
1. Use one array/map
2. Increment for s1, decrement for s2
3. Check if all counts are zero

---

## 📋 Problem Details

**Problem Name:** Anagram  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/anagram-1587115620/1  
**Difficulty:** Easy  
**Category:** Strings, Hashing

### Constraints
- 1 ≤ s1.length(), s2.length() ≤ 10^5
- Strings contain only lowercase English letters

### Expected Complexity
- **Time Complexity:** O(n) - where n is length of strings
- **Space Complexity:** O(1) - fixed size array (26 letters) or O(26) = O(1)

---

## 📥 Input / Output

### Input Format
```
s1 = "listen"
s2 = "silent"
```

### Output Format
```
true
```

### Sample Test Cases

#### Test Case 1
**Input:**  
```
s1 = "listen"
s2 = "silent"
```
**Output:**  
```
true
```
**Explanation:** Both have same characters: l, i, s, t, e, n

#### Test Case 2
**Input:**  
```
s1 = "gram"
s2 = "arm"
```
**Output:**  
```
false
```
**Explanation:** Different lengths, cannot be anagrams.

#### Test Case 3
**Input:**  
```
s1 = "allergy"
s2 = "gallery"
```
**Output:**  
```
true
```
**Explanation:** Same characters with same frequencies.

#### Test Case 4
**Input:**  
```
s1 = "a"
s2 = "a"
```
**Output:**  
```
true
```

---

## 💡 Interview Notes

### Edge Cases to Consider
1. **Different lengths** → Immediately return false (cannot be anagrams)
2. **Empty strings** → Both empty = true
3. **Single character** → Must be same character
4. **Same string** → Always anagram
5. **Case sensitivity** → "Listen" vs "silent" (depends on requirements)

### Common Mistakes
- ❌ Not checking length first (wastes time counting)
- ❌ Using sorting without considering time complexity
- ❌ Not handling empty strings
- ❌ Creating two maps when one is sufficient
- ❌ Not considering space/punctuation in general case

### Optimization Ideas
- ✅ Check lengths first - O(1) early rejection
- ✅ Use int array for lowercase letters (faster than HashMap)
- ✅ Single pass with increment/decrement
- 🔹 For Unicode: Use HashMap instead of array
- 🔹 Can use XOR for some scenarios (but doesn't work for anagrams!)

### Interview Talking Points
- "I'll first check if lengths are equal - different lengths can't be anagrams"
- "I'll use a frequency array since we only have lowercase letters"
- "I'll increment counts for first string, decrement for second"
- "If all counts end at zero, they're anagrams"

### Follow-up Questions You Might Get
1. **Group all anagrams from an array?** (HashMap with sorted string as key)
2. **Find all anagram occurrences in a text?** (Sliding window)
3. **Case insensitive check?** (Convert to same case first)
4. **Handle spaces and punctuation?** (Filter non-alphanumeric)
5. **What if strings have Unicode characters?** (Use HashMap instead of array)

---

## 🔗 Related Problems
- Group Anagrams
- Find All Anagrams in a String (Sliding Window)
- Valid Anagram
- Permutation in String
- Minimum Window Substring

---

## 🎓 Multiple Approaches Comparison

| Approach | Time | Space | Pros | Cons |
|----------|------|-------|------|------|
| Sorting | O(n log n) | O(1) or O(n) | Simple, short code | Slower |
| Two HashMaps | O(n) | O(n) | General, works for any chars | Extra space |
| Single int[26] | O(n) | O(1) | ✅ Fastest, optimal | Only lowercase a-z |
| Single HashMap | O(n) | O(n) | Works for Unicode | Slightly slower |

---

## 💻 Code Approaches

### Approach 1: Frequency Array (Optimal for lowercase letters)
```java
if (s1.length() != s2.length()) return false;

int[] count = new int[26];

for (int i = 0; i < s1.length(); i++) {
    count[s1.charAt(i) - 'a']++;
    count[s2.charAt(i) - 'a']--;
}

for (int c : count) {
    if (c != 0) return false;
}

return true;
```

### Approach 2: Sorting
```java
if (s1.length() != s2.length()) return false;

char[] arr1 = s1.toCharArray();
char[] arr2 = s2.toCharArray();

Arrays.sort(arr1);
Arrays.sort(arr2);

return Arrays.equals(arr1, arr2);
```

### Approach 3: HashMap (General solution)
```java
if (s1.length() != s2.length()) return false;

Map<Character, Integer> map = new HashMap<>();

for (char c : s1.toCharArray()) {
    map.put(c, map.getOrDefault(c, 0) + 1);
}

for (char c : s2.toCharArray()) {
    if (!map.containsKey(c)) return false;
    map.put(c, map.get(c) - 1);
    if (map.get(c) < 0) return false;
}

return true;
```

---

## 🧩 Problem Patterns

This problem demonstrates the **"Frequency Counting"** pattern:
- Count occurrences of elements
- Compare counts between two collections
- Use array for small fixed range (a-z)
- Use HashMap for larger/dynamic range
- Common in: Anagrams, Substring problems, Permutations

---

## 🎯 Key Decisions

### When to use what?

**int[26] array:**
- ✅ Only lowercase a-z
- ✅ Need optimal speed
- ✅ Fixed character set

**HashMap:**
- ✅ Unicode characters
- ✅ Unknown character range
- ✅ Case-sensitive + punctuation

**Sorting:**
- ✅ Quick implementation
- ❌ Don't use in interviews (suboptimal)
- ✅ OK if explicitly asked for multiple approaches

---

## 💡 Key Takeaway

**Frequency counting beats sorting for string comparison!** When checking if two collections have same elements with same counts, counting is O(n) vs sorting's O(n log n).
