package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 90. Subsets II
 */
public class Solution_90 {

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    return subsetsWithDup(nums, 0, new ArrayList<>(), new ArrayList<>());
  }

  private List<List<Integer>> subsetsWithDup(int[] nums, int start, List<List<Integer>> result,
      List<Integer> subList) {
    result.add(new ArrayList<>(subList));
    int i = start;
    while (i < nums.length) {
      subList.add(nums[i]);
      subsetsWithDup(nums, i + 1, result, subList);
      subList.remove(subList.size() - 1);
      i++;
      while (i < nums.length && nums[i] == nums[i - 1]) {
        i++;
      }
    }
    return result;
  }
}
