# Print N to 1 (Recursion)

## 🎯 Concept Explanation

### What?
Print numbers from n down to 1 using **recursion only** (no loops allowed). This is the simplest introduction to recursive thinking.

### Why do interviewers ask this?
- Tests understanding of **base case** and **recursive case**
- Foundation for all recursion problems
- Checks grasp of **call stack** mechanism
- Demonstrates recursion vs iteration trade-offs
- Gateway to backtracking and divide-and-conquer

### When to use?
- When problem naturally divides into smaller subproblems
- Tree/graph traversal
- Backtracking problems
- Divide and conquer algorithms
- When explicitly asked to avoid loops

### Where does it fit in DSA?
- **Pattern:** Basic Recursion
- **Category:** Recursion Fundamentals
- **Foundation for:** All recursive algorithms, DFS, Backtracking

### How to apply?

**Recursion Structure:**
```
1. Base case: Condition to stop recursion
2. Recursive case: Do work + call function with smaller input
```

**For this problem:**
- **Base case:** if (n <= 0) return;
- **Recursive case:** print(n), then call printNos(n-1)

---

## 📋 Problem Details

**Problem Name:** Print N to 1  
**GeeksForGeeks Link:** https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1  
**Difficulty:** Easy  
**Category:** Recursion

### Constraints
- 1 ≤ n ≤ 1000

### Expected Complexity
- **Time Complexity:** O(n) - n function calls
- **Space Complexity:** O(n) - recursion call stack

---

## 📥 Input / Output

### Input Format
```
n = 5
```

### Output Format
```
5 4 3 2 1
```

### Sample Test Cases

#### Test Case 1
**Input:**  
```
n = 5
```
**Output:**  
```
5 4 3 2 1
```

#### Test Case 2
**Input:**  
```
n = 10
```
**Output:**  
```
10 9 8 7 6 5 4 3 2 1
```

#### Test Case 3
**Input:**  
```
n = 1
```
**Output:**  
```
1
```

---

## 💡 Interview Notes

### Edge Cases to Consider
1. **n = 1** → Print 1 and stop
2. **n = 0** → Print nothing (base case)
3. **Large n** → Watch for stack overflow (around n > 10000)

### Common Mistakes
- ❌ No base case → Infinite recursion → StackOverflowError
- ❌ Wrong base case (e.g., n == 0 instead of n <= 0)
- ❌ Printing after recursive call (would print 1 to n instead!)
- ❌ Not understanding call stack order

### Optimization Ideas
- ✅ This is already optimal for recursion
- 🔹 Tail recursion optimization (not automatic in Java)
- 🔹 For very large n, use iteration (O(1) space)
- ❌ Can't improve O(n) time - must print n numbers

### Interview Talking Points
- "I'll use recursion with a clear base case to stop"
- "Base case: when n <= 0, return"
- "Recursive case: print n, then call function with n-1"
- "Each call handles one number, then delegates to smaller problem"

### Follow-up Questions You Might Get
1. **Print 1 to N instead?** (Recurse first, then print)
2. **Print using tail recursion?** (Pass accumulator)
3. **What happens without base case?** (StackOverflowError)
4. **Can you do this iteratively?** (Yes, simple loop)
5. **How much space does recursion use?** (O(n) stack space)

---

## 🔗 Related Problems
- Print 1 to N
- Factorial
- Fibonacci
- Sum of N Natural Numbers
- Tower of Hanoi

---

## 🎓 Recursion Fundamentals

### Call Stack Visualization
```
printNos(5):
  print 5
  printNos(4):
    print 4
    printNos(3):
      print 3
      printNos(2):
        print 2
        printNos(1):
          print 1
          printNos(0):  ← Base case, return
          return
        return
      return
    return
  return
```

### Order of Execution Matters!
```java
// This prints n to 1 (print BEFORE recurse)
void printNto1(int n) {
    if (n <= 0) return;
    System.out.print(n + " ");
    printNto1(n - 1);
}

// This prints 1 to n (print AFTER recurse)
void print1toN(int n) {
    if (n <= 0) return;
    print1toN(n - 1);
    System.out.print(n + " ");
}
```

---

## 💻 Code Approaches

### Approach 1: Basic Recursion
```java
public void printNos(int n) {
    // Base case
    if (n <= 0) {
        return;
    }
    
    // Print current number
    System.out.print(n + " ");
    
    // Recursive call with smaller problem
    printNos(n - 1);
}
```

### Approach 2: Compact Version
```java
public void printNos(int n) {
    if (n > 0) {
        System.out.print(n + " ");
        printNos(n - 1);
    }
}
```

### For Comparison: Iterative Approach
```java
public void printNos(int n) {
    for (int i = n; i >= 1; i--) {
        System.out.print(i + " ");
    }
}
// Time: O(n), Space: O(1) - more efficient!
```

---

## 🧩 Recursion Components

Every recursive function needs:

### 1. Base Case
- Condition that stops recursion
- Prevents infinite recursion
- Usually handles smallest/simplest input

### 2. Recursive Case
- Calls the function with smaller/simpler input
- **Must progress toward base case**
- Does the actual work

### 3. Trust the Recursion
- Don't trace every call mentally
- Trust that recursive call solves smaller problem
- Focus on: base case + single recursive step

---

## 🎯 Recursion vs Iteration

| Aspect | Recursion | Iteration |
|--------|-----------|-----------|
| Code | Often shorter, clearer | Can be longer |
| Space | O(n) stack space | O(1) typically |
| Speed | Slower (function call overhead) | Faster |
| Use when | Problem naturally recursive | Simple counting/looping |

---

## 💡 Key Takeaway

**Recursion is solving a big problem by:**
1. Handling the base case (smallest problem)
2. Solving a slightly smaller version of the problem
3. Using that solution to solve the original problem

**For this problem:**
- Big problem: Print n to 1
- Smaller problem: Print (n-1) to 1
- Work: Print n, then solve smaller problem
