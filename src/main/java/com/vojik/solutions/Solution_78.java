package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 */
public class Solution_78 {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtracking(nums, 0, result, new ArrayList<Integer>());
    return result;
  }

  private void backtracking(int[] nums, int idx, List<List<Integer>> result,
      List<Integer> candidate) {
    result.add(new ArrayList<>(candidate));
    for (int k = idx; k < nums.length; k++) {
      candidate.add(nums[k]);
      backtracking(nums, k + 1, result, candidate);
      candidate.remove(candidate.size() - 1);
    }
  }
}
