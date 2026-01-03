/* Problem: Level Order Traversal
 * Link: https://www.geeksforgeeks.org/problems/level-order-traversal/1
 * Time: O(n), Space: O(n) */

import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; left = right = null; }
}

class Solution {
    ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Write your logic here (BFS using queue)
        return new ArrayList<>();
    }
}
