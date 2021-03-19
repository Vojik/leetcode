package com.vojik.solutions;

/**
 * 376. Wiggle Subsequence
 */
public class Solution_376 {

  public int wiggleMaxLength(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return 1;
    }

    int prevWiggle = 0;
    int ans = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      int curVal = nums[i + 1] - nums[i];
      if (curVal == 0) {
        continue;
      }
      if ((curVal > 0 && prevWiggle < 0) || (curVal < 0 && prevWiggle > 0) || prevWiggle == 0) {
        prevWiggle = curVal;
        ans++;
      }
    }
    return ans > 0 ? ++ans : 1;
  }
}
