package com.vojik.solutions;

import com.vojik.helpers.TreeNode_677;
import java.util.HashMap;
import java.util.Map;

/**
 * 677. Map Sum Pairs
 */
public class Solution_677 {

  private TreeNode_677 root;
  private Map<String, Integer> map;

  /**
   * Initialize your data structure here.
   */
  public Solution_677() {
    this.root = new TreeNode_677();
    this.map = new HashMap<>();
  }

  public void insert(String key, int val) {
    int diff = val;
    if (map.containsKey(key)) {
      diff = val - map.get(key);
    }
    map.put(key, val);
    TreeNode_677 root = this.root;
    for (int i = 0; i < key.length(); i++) {
      TreeNode_677 node = root.children[key.charAt(i) - 'a'];
      if (node == null) {
        node = new TreeNode_677();
      }
      node.sum += diff;
      root.children[key.charAt(i) - 'a'] = node;
      root = node;
    }
  }

  public int sum(String prefix) {
    TreeNode_677 root = this.root;
    for (int i = 0; i < prefix.length(); i++) {
      TreeNode_677 node = root.children[prefix.charAt(i) - 'a'];
      if (node == null) {
        return 0;
      }
      root = node;
    }
    return root.sum;
  }

}
