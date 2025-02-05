package com.vojik.solutions;

/** 303. Range Sum Query - Immutable */
public class Solution_303 {

  private final int[] prefixSum;

  public Solution_303(int[] nums) {
    prefixSum = new int[nums.length + 1];
    int idx = 1;
    for (int n : nums) {
      prefixSum[idx] = prefixSum[idx - 1] + n;
      idx++;
    }
  }

  public int sumRange(int left, int right) {
    return prefixSum[right + 1] - prefixSum[left];
  }
}
