package com.vojik.solutions;

import com.vojik.helpers.TreeNode;

public class Solution_2339 {

  public int findClosestNumber(int[] nums) {
    int ans = Integer.MAX_VALUE;
    for (int n : nums) {
      if (Math.abs(n) < Math.abs(ans) || (Math.abs(n) == Math.abs(ans) && n > ans)) {
        ans = n;
      }
    }
    return ans;
  }
}
