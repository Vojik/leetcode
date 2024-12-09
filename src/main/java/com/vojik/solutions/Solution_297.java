package com.vojik.solutions;

import com.vojik.helpers.TreeNode;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 297. Serialize and Deserialize Binary Tree
 */
public class Solution_297 {

  private final static String NONE = "None";

  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    dfs(root, sb);
    return sb.toString();
  }

  private void dfs(TreeNode root, StringBuilder sb) {
    if (root == null) {
      sb.append(NONE);
      sb.append(",");
    } else {
      sb.append(root.val);
      sb.append(",");
      dfs(root.left, sb);
      dfs(root.right, sb);
    }
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    List<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
    return dfs(nodes);
  }

  private TreeNode dfs(List<String> nodes) {
    if (nodes.get(0).equals(NONE)) {
      nodes.remove(0);
      return null;
    }

    TreeNode node = new TreeNode(Integer.parseInt(nodes.get(0)));
    nodes.remove(0);
    node.left = dfs(nodes);
    node.right = dfs(nodes);
    return node;
  }
}
