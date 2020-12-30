package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * 94. Binary Tree Inorder Traversal
 *
 * <p>Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 * <p>Example 1:
 * <p>Input: root = [1,null,2,3] Output: [1,3,2]
 *
 * <p>Example 2:
 * <p>Input: root = [] Output: []
 *
 * <p>Example 3:
 *
 * <p>Input: root = [1] Output: [1]
 * <p>
 * Example 4:
 *
 * <p>Input: root = [1,2] Output: [2,1]
 * <p>
 * Example 5:
 *
 * <p>Input: root = [1,null,2] Output: [1,2]
 *
 * <p>Constraints:
 * <p>The number of nodes in the tree is in the range [0, 100]. -100 <= Node.val <= 100
 *
 * <p>Follow up:
 * <p>Recursive solution is trivial, could you do it iteratively?
 */
public class Solution_94 {

  // Time: O(n) Space: O(n)
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    inorder(root, result);

    return result;
  }

  private void inorder(TreeNode node, List<Integer> result) {
    if (node == null) {
      return;
    }
    inorder(node.left, result);
    result.add(node.val);
    inorder(node.right, result);
  }

  // Time: O(n) Space: O(n)
  public List<Integer> inorderTraversal2(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    Set<TreeNode> visited = new HashSet<>();
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.empty()) {
      TreeNode node = stack.peek();
      if (node.left != null && !visited.contains(node.left)) {
        stack.push(node.left);
        continue;
      }
      result.add(node.val);
      stack.pop();
      visited.add(node);

      if (node.right != null && !visited.contains(node.right)) {
        stack.push(node.right);
      }
    }
    return result;
  }
}
