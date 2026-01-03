# Power of Numbers

## 🎯 Concept Explanation

### What?
Calculate x^n (x raised to power n) efficiently. Example: 2^10 = 1024. Naive approach multiplies x, n times. Optimized approach uses divide and conquer.

### Why do interviewers ask this?
- Tests **divide and conquer** optimization
- Classic example of O(n) → O(log n) improvement
- Shows recursion optimization thinking
- Foundation for modular arithmetic
- Common in competitive programming

### When to use?
- Large exponentiation calculations
- Modular arithmetic problems
- RSA cryptography
- Mathematical computations

### Where does it fit in DSA?
- **Pattern:** Divide and Conquer, Fast Exponentiation
- **Category:** Recursion, Mathematics
- **Foundation for:** Matrix exponentiation, Modular arithmetic

### How to apply?

**Key Insight:**
- x^n = (x^(n/2))^2 if n is even
- x^n = x × (x^(n/2))^2 if n is odd

This reduces O(n) to O(log n)!

---

## 📋 Problem Details

**Problem Name:** Power of Numbers  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1  
**Difficulty:** Easy  
**Category:** Recursion, Mathematics

### Constraints
- 1 ≤ x, n ≤ 10^9
- Return result modulo 10^9+7

### Expected Complexity
- **Time:** O(log n)
- **Space:** O(log n) call stack

---

## 📥 Input / Output

### Input Format
```
x = 2, n = 10
```

### Output Format
```
1024
```

### Sample Test Cases

#### Test Case 1
**Input:** `x = 2, n = 10`  
**Output:** `1024`

#### Test Case 2
**Input:** `x = 3, n = 5`  
**Output:** `243`

---

## 💡 Interview Notes

### Edge Cases
1. **n = 0** → Return 1 (anything^0 = 1)
2. **n = 1** → Return x
3. **x = 0** → Return 0
4. **Overflow** → Use modulo arithmetic

### Optimization
**Naive O(n):**
```
x^10 = x * x * x * x * x * x * x * x * x * x (10 multiplications)
```

**Optimized O(log n):**
```
x^10 = (x^5)^2
x^5 = x * (x^2)^2
x^2 = (x^1)^2
x^1 = x
Only 4 multiplications!
```

---

## 💻 Code

### Approach: Fast Exponentiation (Binary Exponentiation)
```java
static final int MOD = 1000000007;

public long power(int x, int n) {
    // Base case
    if (n == 0) return 1;
    
    // Calculate power of n/2
    long half = power(x, n / 2);
    half = (half * half) % MOD;
    
    // If n is odd, multiply by x once more
    if (n % 2 != 0) {
        half = (half * x) % MOD;
    }
    
    return half;
}
```

### Iterative Version (More efficient)
```java
public long power(int x, int n) {
    long result = 1;
    long base = x;
    
    while (n > 0) {
        if (n % 2 == 1) {
            result = (result * base) % MOD;
        }
        base = (base * base) % MOD;
        n /= 2;
    }
    
    return result;
}
```

---

## 🎯 Time Complexity Comparison

| Approach | Multiplications for x^1000 |
|----------|---------------------------|
| Naive | 1000 |
| Fast Exponentiation | ~10 (log₂(1000)) |

---

## 🔗 Related Problems
- Pow(x, n)
- Super Pow
- Modular Exponentiation
- Fibonacci with Matrix Exponentiation
