# Frequency Counter

**Link:** https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0  
**Pattern:** HashMap for counting  
**Complexity:** O(n) time, O(n) space

```java
public void frequencyCount(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    // Print or return frequencies
}
```
