package com.vojik.solutions;

import com.vojik.helpers.TreeNode_116;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_117 {

  public TreeNode_116 connect(TreeNode_116 root) {
    if (root == null) {
      return root;
    }
    TreeNode_116 ans = root;
    Queue<TreeNode_116> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {

        TreeNode_116 n = queue.poll();

        if (i < size - 1) {
          n.next = queue.peek();
        }

        if (n.left != null) {
          queue.add(n.left);
        }

        if (n.right != null) {
          queue.add(n.right);
        }
      }
    }
    return ans;
  }
}
