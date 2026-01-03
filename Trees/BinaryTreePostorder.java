/* Problem: Postorder Traversal
 * Link: https://www.geeksforgeeks.org/problems/postorder-traversal/1
 * Time: O(n), Space: O(h) */

import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; left = right = null; }
}

class Solution {
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        // Write your logic here: Left -> Right -> Root
        return result;
    }
}
