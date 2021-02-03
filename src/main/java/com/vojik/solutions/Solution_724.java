package com.vojik.solutions;

/**
 * 724. Find Pivot Index
 */
public class Solution_724 {

  public int pivotIndex(int[] nums) {
    int fullSum = 0;
    for (int i = 0; i < nums.length; i++) {
      fullSum += nums[i];
    }

    int leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
      if ((fullSum - nums[i]) % 2 == 0 && leftSum == (fullSum - nums[i]) / 2) {
        return i;
      }
      leftSum += nums[i];
    }
    return -1;
  }
}
