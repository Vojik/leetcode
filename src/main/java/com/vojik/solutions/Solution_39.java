package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 39. Combination Sum */
public class Solution_39 {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(candidates);
    combinationSum(candidates, target, 0, new ArrayList<>(), result);
    return result;
  }

  private void combinationSum(
      int[] candidates,
      int target,
      int index,
      List<Integer> currentList,
      List<List<Integer>> result) {
    if (target == 0) {
      result.add(new ArrayList<>(currentList));
    } else {
      for (int i = index; i < candidates.length; i++) {
        if (target - candidates[i] < 0) {
          return;
        }
        currentList.add(candidates[i]);
        combinationSum(candidates, target - candidates[i], i, currentList, result);
        currentList.remove(currentList.size() - 1);
      }
    }
  }
}
