# Selection Sort

## 🎯 Concept
Find minimum element and place at beginning.

**Link:** https://www.geeksforgeeks.org/problems/selection-sort/1  
**Complexity:** O(n²) time, O(1) space

## 💻 Code
```java
public void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        // Swap
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }
}
```
