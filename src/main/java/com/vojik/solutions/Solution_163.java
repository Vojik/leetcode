package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 163. Missing Ranges
 */
public class Solution_163 {

  public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
    List<List<Integer>> result = new ArrayList<>();
    if (nums.length == 0) {
      result.add(List.of(lower, upper));
      return result;
    }

    if (nums[0] > lower) {
      result.add(List.of(lower, nums[0] - 1));
      lower = nums[0];
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] - lower > 1) {
        result.add(List.of(lower + 1, nums[i] - 1));
      }
      lower = nums[i];
    }
    if (lower != upper) {
      result.add(List.of(lower + 1, upper));
    }

    return result;
  }
}
