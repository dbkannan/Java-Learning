# Bubble Sort

## 🎯 Concept
Repeatedly swap adjacent elements if in wrong order.

**Link:** https://www.geeksforgeeks.org/problems/bubble-sort/1  
**Complexity:** O(n²) time, O(1) space

## 💻 Code
```java
public void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        boolean swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) break; // Already sorted
    }
}
```
