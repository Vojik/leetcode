package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 40. Combination Sum II
 */
public class Solution_40 {

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> result = new LinkedList<List<Integer>>();
    Arrays.sort(candidates);
    backtracking(result, candidates, 0, target, new ArrayList<>());
    return result;
  }

  private void backtracking(List<List<Integer>> result, int[] candidates, int idx, int totalLeft,
      List<Integer> current) {
    if (totalLeft < 0) {
      return;
    }
    if (totalLeft == 0) {
      result.add(new ArrayList<>(current));
    } else {
      for (int i = idx; i < candidates.length && totalLeft >= candidates[i]; i++) {
        if (i > idx && candidates[i] == candidates[i - 1]) {
          continue;
        }
        current.add(candidates[i]);
        backtracking(result, candidates, i + 1, totalLeft - candidates[i], current);
        current.remove(current.size() - 1);
      }
    }
  }
}
