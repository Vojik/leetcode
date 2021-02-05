package com.vojik.solutions;

import java.util.Arrays;

/** 561. Array Partition I */
public class Solution_561 {

  // Time: O(n*log(n) + n = n*log(n)) Space: O(log(n))
  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums); // O(n*log(n)) Space: O(log(n))
    int sumMin = 0;
    for (int i = 0; i < nums.length; i += 2) { // O(n)
      sumMin += nums[i];
    }
    return sumMin;
  }
}