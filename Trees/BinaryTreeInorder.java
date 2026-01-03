/* Problem: Inorder Traversal
 * Link: https://www.geeksforgeeks.org/problems/inorder-traversal/1
 * Time: O(n), Space: O(h) for recursion */

import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; left = right = null; }
}

class Solution {
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        // Write your logic here: Left -> Root -> Right
        return result;
    }
}
