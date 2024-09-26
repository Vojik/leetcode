package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 */
public class Solution_46 {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtracking(nums, new ArrayList<Integer>(), result);
    return result;
  }

  private void backtracking(int[] nums, List<Integer> tempList, List<List<Integer>> result) {
    if (tempList.size() == nums.length) {
      result.add(new ArrayList<>(tempList));
    } else {
      for (int num : nums) {
        if (!tempList.contains(num)) {
          tempList.add(num);
          backtracking(nums, tempList, result);
          tempList.remove(tempList.size() - 1);
        }
      }
    }
  }
}
