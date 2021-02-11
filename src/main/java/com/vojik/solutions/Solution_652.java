package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 652. Find Duplicate Subtrees
 */
public class Solution_652 {

  // Time: O(n) Space: O(n)
  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    List<TreeNode> result = new ArrayList<>();
    Map<String, Integer> count = new HashMap<>();
    helper(root, count, result);
    return result;
  }

  private String helper(TreeNode root, Map<String, Integer> count, List<TreeNode> result) {
    if (root == null) {
      return "";
    }
    String key =
        root.val + ";" + helper(root.left, count, result) + ";" + helper(root.right, count, result);
    count.put(key, count.getOrDefault(key, 0) + 1);
    if (count.get(key) == 2) {
      result.add(root);
    }
    return key;
  }
}
