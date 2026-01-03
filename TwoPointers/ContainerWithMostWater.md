# Container With Most Water

**Link:** https://www.geeksforgeeks.org/problems/container-with-most-water0535/1  
**Pattern:** Two Pointers (greedy)  
**Complexity:** O(n) time, O(1) space

```java
public int maxArea(int[] height) {
    int left = 0, right = height.length - 1;
    int maxWater = 0;
    
    while (left < right) {
        int width = right - left;
        int h = Math.min(height[left], height[right]);
        maxWater = Math.max(maxWater, width * h);
        
        // Move pointer with smaller height
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    return maxWater;
}
```
