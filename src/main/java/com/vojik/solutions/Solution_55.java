package com.vojik.solutions;

/**
 * 55. Jump Game
 */
public class Solution_55 {

  public boolean canJump(int[] nums) {
    int jumps = 1;
    for (int i = 0; i < nums.length; i++) {
      jumps--;
      if (i == nums.length - 1) {
        return true;
      }
      jumps = Math.max(jumps, nums[i]);
      if (jumps == 0) {
        break;
      }
    }
    return false;
  }
}
