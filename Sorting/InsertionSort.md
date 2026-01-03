# Insertion Sort

## 🎯 Concept
Build sorted array one element at a time.

**Link:** https://www.geeksforgeeks.org/problems/insertion-sort/1  
**Complexity:** O(n²) time, O(1) space

## 💻 Code
```java
public void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
```
