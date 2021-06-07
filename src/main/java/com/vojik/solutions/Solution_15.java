package com.vojik.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 15. 3Sum */
public class Solution_15 {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) { // skip duplicates
        continue;
      }
      int target = -nums[i];
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        if (nums[left] + nums[right] == target) {
          res.add(List.of(nums[i], nums[left], nums[right]));
          while (left < right && nums[left] == nums[left + 1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right - 1]) {
            right--;
          }
          left++;
          right--;

        } else if (nums[left] + nums[right] > target) {
          right--;
        } else {
          left++;
        }
      }
    }

    return res;
  }
}
