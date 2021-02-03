package com.vojik.solutions;

/**
 * 747. Largest Number At Least Twice of Others
 */
public class Solution_747 {

  public int dominantIndex(int[] nums) {
    int firstLargest = nums[0];
    int firstLargestIdx = 0;
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] >= firstLargest) {
        secondLargest = firstLargest;
        firstLargest = nums[i];
        firstLargestIdx = i;
      } else if (nums[i] > secondLargest) {
        secondLargest = nums[i];
      }
    }
    return firstLargest >= secondLargest * 2 ? firstLargestIdx : -1;
  }
}
