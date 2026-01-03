/* Problem: Preorder Traversal
 * Link: https://www.geeksforgeeks.org/problems/preorder-traversal/1
 * Time: O(n), Space: O(h) */

import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; left = right = null; }
}

class Solution {
    ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        // Write your logic here: Root -> Left -> Right
        return result;
    }
}
