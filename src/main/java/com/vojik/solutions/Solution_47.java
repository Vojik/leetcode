package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 47. Permutations II
 */
public class Solution_47 {

  public List<List<Integer>> permuteUnique(int[] nums) {
    Set<List<Integer>> result = new HashSet<>();
    backtracking(nums, result, new ArrayList<Integer>(), new HashSet<Integer>());
    return new ArrayList<>(result);
  }

  private void backtracking(int[] nums, Set<List<Integer>> result, List<Integer> candidate,
      Set<Integer> idxSeen) {
    if (candidate.size() == nums.length) {
      result.add(new ArrayList<>(candidate));
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (!idxSeen.contains(i)) {
          candidate.add(nums[i]);
          idxSeen.add(i);
          backtracking(nums, result, candidate, idxSeen);
          candidate.remove(candidate.size() - 1);
          idxSeen.remove(i);
        }
      }
    }
  }
}
