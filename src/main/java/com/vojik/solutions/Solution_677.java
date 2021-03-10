package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 677. Map Sum Pairs
 */
public class Solution_677 {

  private TreeNode root;
  private Map<String, Integer> map;

  /**
   * Initialize your data structure here.
   */
  public Solution_677() {
    this.root = new TreeNode();
    this.map = new HashMap<>();
  }

  public void insert(String key, int val) {
    int diff = val;
    if (map.containsKey(key)) {
      diff = val - map.get(key);
    }
    map.put(key, val);
    TreeNode root = this.root;
    for (int i = 0; i < key.length(); i++) {
      TreeNode node = root.children[key.charAt(i) - 'a'];
      if (node == null) {
        node = new TreeNode();
      }
      node.sum += diff;
      root.children[key.charAt(i) - 'a'] = node;
      root = node;
    }
  }

  public int sum(String prefix) {
    TreeNode root = this.root;
    for (int i = 0; i < prefix.length(); i++) {
      TreeNode node = root.children[prefix.charAt(i) - 'a'];
      if (node == null) {
        return 0;
      }
      root = node;
    }
    return root.sum;
  }

}

class TreeNode {

  TreeNode[] children;
  int sum;

  public TreeNode() {
    this.children = new TreeNode[26];
    this.sum = 0;
  }
}
