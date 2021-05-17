package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/** 863. All Nodes Distance K in Binary Tree */
public class Solution_863 {

  public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    List<Integer> result = new ArrayList<>();
    Map<TreeNode, TreeNode> parentMap = new HashMap<>();
    Set<TreeNode> seen = new HashSet<>();
    dfs(root, null, parentMap);

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(target);
    seen.add(target);

    int level = 0;
    int distance = 0;
    while (!queue.isEmpty()) {
      if (distance == k) {
        while (!queue.isEmpty()) {
          result.add(queue.poll().val);
        }
        return result;
      }

      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();

        if (node.left != null && !seen.contains(node.left)) {
          queue.add(node.left);
          seen.add(node.left);
        }

        if (node.right != null && !seen.contains(node.right)) {
          queue.add(node.right);
          seen.add(node.right);
        }

        TreeNode par = parentMap.get(node);
        if (par != null && !seen.contains(par)) {
          queue.add(par);
          seen.add(par);
        }
      }
      distance++;
    }

    return result;
  }

  private void dfs(TreeNode root, TreeNode parent, Map<TreeNode, TreeNode> parentMap) {
    if (root != null) {
      parentMap.put(root, parent);
      dfs(root.left, root, parentMap);
      dfs(root.right, root, parentMap);
    }
  }
}
