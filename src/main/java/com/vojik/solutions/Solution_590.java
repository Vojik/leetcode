package com.vojik.solutions;

import com.vojik.helpers.Node;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 590. n-ary-tree-postorder-traversal
 */
public class Solution_590 {

  private List<Integer> answer = new ArrayList<>();

  public List<Integer> postorder(Node root) {
    if (root == null) return answer;
    for (Node child : root.neighbors) {
      postorder(child);
    }
    answer.add(root.val);
    return answer;
  }
}
