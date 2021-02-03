package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. Combinations
 */
public class Solution_77 {

  public List<List<Integer>> combine(int n, int k) {
    return backtracking(n, k, 1, new ArrayList<>(), new ArrayList<>());
  }

  private List<List<Integer>> backtracking(int n, int k, int start, List<List<Integer>> result,
      List<Integer> subList) {
    if (subList.size() == k) {
      result.add(new ArrayList(subList));
    } else {
      for (int i = start; i <= n; i++) {
        subList.add(i);
        backtracking(n, k, i + 1, result, subList);
        subList.remove(subList.size() - 1);
      }
    }
    return result;
  }

}
