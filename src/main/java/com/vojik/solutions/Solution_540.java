package com.vojik.solutions;

public class Solution_540 {

  public int singleNonDuplicate(int[] nums) {
    int lo = 0;
    int hi = nums.length - 1;
    int ans = -1;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (isValid(nums, mid)) {
        lo = mid + 1;
      } else {
        ans = nums[mid];
        hi = mid - 1;
      }
    }
    return ans;
  }

  private boolean isValid(int[] nums, int idx) {
    if (idx == nums.length - 1) {
      return false;
    }
    if (idx % 2 == 0) {
      return nums[idx] == nums[idx + 1];
    } else {
      return nums[idx] == nums[idx - 1];
    }
  }
}
