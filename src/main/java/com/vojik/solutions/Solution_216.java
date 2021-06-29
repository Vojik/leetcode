package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/** 216. Combination Sum III */
public class Solution_216 {

  public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(n, k, 1, new ArrayList<>(), result);
    return result;
  }

  private void backtrack(
      int target, int k, int index, List<Integer> combination, List<List<Integer>> result) {
    if (combination.size() == k && target == 0) {
      result.add(new ArrayList<>(combination));

    } else if (target > 0 && combination.size() < k) {
      for (int nextNum = index; nextNum <= 9; nextNum++) {
        combination.add(nextNum);
        backtrack(target - nextNum, k, nextNum + 1, combination, result);
        combination.remove(combination.size() - 1);
      }
    }
  }
}
