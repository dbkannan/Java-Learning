# Factorial of a Number

## 🎯 Concept Explanation

### What?
Factorial of n (denoted n!) is the product of all positive integers from 1 to n. Example: 5! = 5 × 4 × 3 × 2 × 1 = 120

### Why do interviewers ask this?
- Classic recursion example showing **recursive formula**
- Tests understanding of base case (0! = 1)
- Demonstrates returning values from recursion
- Foundation for permutations/combinations
- Shows multiplication accumulation pattern

### When to use?
- Permutation and combination calculations
- Probability problems
- Series expansion (Taylor, Maclaurin)
- Mathematical computations

### Where does it fit in DSA?
- **Pattern:** Accumulative Recursion
- **Category:** Recursion, Mathematics
- **Foundation for:** Permutations, Combinations, DP problems

### How to apply?

**Recursive Definition:**
- Base case: 0! = 1, 1! = 1
- Recursive: n! = n × (n-1)!

---

## 📋 Problem Details

**Problem Name:** Factorial  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/factorial5739/1  
**Difficulty:** Easy  
**Category:** Recursion, Mathematics

### Constraints
- 0 ≤ n ≤ 20 (to fit in long)

### Expected Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) - call stack

---

## 📥 Input / Output

### Input Format
```
n = 5
```

### Output Format
```
120
```

### Sample Test Cases

#### Test Case 1
**Input:** `n = 5`  
**Output:** `120`  
**Explanation:** 5! = 5 × 4 × 3 × 2 × 1 = 120

#### Test Case 2
**Input:** `n = 0`  
**Output:** `1`  
**Explanation:** 0! = 1 by definition

#### Test Case 3
**Input:** `n = 1`  
**Output:** `1`

---

## 💡 Interview Notes

### Edge Cases
1. **n = 0** → Return 1 (important!)
2. **n = 1** → Return 1
3. **Large n (>20)** → Use BigInteger

### Common Mistakes
- ❌ Base case n == 1 (misses 0!)
- ❌ Returning 0 for base case
- ❌ Integer overflow for n > 12

### Interview Talking Points
- "I'll use recursion: n! = n × (n-1)!"
- "Base case is 0 or 1, both return 1"
- "I'll use long to handle larger values"

---

## 💻 Code

```java
public long factorial(int n) {
    // Base cases
    if (n == 0 || n == 1) {
        return 1;
    }
    
    // Recursive case: n! = n * (n-1)!
    return n * factorial(n - 1);
}
```

---

## 🔗 Related Problems
- Fibonacci Number
- Power Calculation
- Permutations
- Combinations (nCr)
