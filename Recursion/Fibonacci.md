# Fibonacci Number

## 🎯 Concept Explanation

### What?
Fibonacci sequence: Each number is the sum of the two preceding ones. Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21...

### Why do interviewers ask this?
- Classic example of **overlapping subproblems**
- Gateway to **Dynamic Programming**
- Shows exponential vs linear time difference
- Tests optimization thinking
- Common in DP and memoization discussions

### When to use?
- Introducing DP concepts
- Optimization problems with overlapping subproblems
- Golden ratio applications
- Nature patterns

### Where does it fit in DSA?
- **Pattern:** Recursion with Overlapping Subproblems
- **Category:** Recursion, Dynamic Programming
- **Foundation for:** DP, Memoization, Climbing Stairs

### How to apply?

**Recursive Definition:**
- fib(0) = 0
- fib(1) = 1
- fib(n) = fib(n-1) + fib(n-2)

**Problem:** Naive recursion is O(2^n) - very slow!

---

## 📋 Problem Details

**Problem Name:** Fibonacci  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1  
**Difficulty:** Easy  
**Category:** Recursion, Dynamic Programming

### Constraints
- 0 ≤ n ≤ 45

### Expected Complexity
- **Time:** O(2^n) naive, O(n) with memoization
- **Space:** O(n) call stack

---

## 📥 Input / Output

### Input Format
```
n = 5
```

### Output Format
```
5
```

### Sample Test Cases

#### Test Case 1
**Input:** `n = 5`  
**Output:** `5`  
**Explanation:** fib(5) = fib(4) + fib(3) = 3 + 2 = 5

#### Test Case 2
**Input:** `n = 0`  
**Output:** `0`

#### Test Case 3
**Input:** `n = 10`  
**Output:** `55`

---

## 💡 Interview Notes

### Edge Cases
1. **n = 0** → Return 0
2. **n = 1** → Return 1
3. **Large n** → Naive recursion times out

### Common Mistakes
- ❌ Not handling n = 0 case
- ❌ Using naive recursion for large n
- ❌ Off-by-one errors in base case

### Optimization
- ✅ Memoization: Store computed values
- ✅ DP bottom-up: O(n) time, O(1) space
- ✅ Matrix exponentiation: O(log n)

### Interview Talking Points
- "Naive recursion repeats calculations"
- "I'll use memoization to avoid recomputation"
- "This is a gateway to Dynamic Programming"

---

## 💻 Code Approaches

### Approach 1: Naive Recursion (For learning only!)
```java
public int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
// Time: O(2^n) - VERY SLOW!
```

### Approach 2: Memoization (Top-Down DP)
```java
int[] memo = new int[n + 1];
Arrays.fill(memo, -1);

public int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    
    if (memo[n] != -1) return memo[n];
    
    memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
    return memo[n];
}
// Time: O(n), Space: O(n)
```

### Approach 3: Iterative DP (Best for interviews)
```java
public int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    
    int prev2 = 0, prev1 = 1;
    
    for (int i = 2; i <= n; i++) {
        int curr = prev1 + prev2;
        prev2 = prev1;
        prev1 = curr;
    }
    
    return prev1;
}
// Time: O(n), Space: O(1) - OPTIMAL!
```

---

## 🎯 Why Fibonacci is Important

This problem demonstrates:
1. **Exponential complexity** of naive recursion
2. **Overlapping subproblems** (fib(n-2) computed multiple times)
3. **Memoization** as optimization
4. Gateway to **Dynamic Programming**

---

## 🔗 Related Problems
- Climbing Stairs
- Min Cost Climbing Stairs
- House Robber
- Decode Ways
