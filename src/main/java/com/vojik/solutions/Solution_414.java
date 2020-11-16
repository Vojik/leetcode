package com.vojik.solutions;

/**
 * 414. Third Maximum Number
 *
 * <p>Given a non-empty array of integers, return the third maximum number in this array. If it
 * does not exist, return the maximum number. The time complexity must be in O(n).
 *
 * <p>Example 1: Input: [3, 2, 1]
 *
 * <p>Output: 1
 *
 * <p>Explanation: The third maximum is 1. Example 2: Input: [1, 2]
 *
 * <p>Output: 2
 *
 * <p>Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * Example 3: Input: [2, 2, 3, 1]
 *
 * <p>Output: 1
 *
 * <p>Explanation: Note that the third maximum here means the third maximum distinct number. Both
 * numbers with value 2 are both considered as second maximum.
 */
public class Solution_414 {

  public int thirdMax(int[] nums) {
    Integer firstMax = null;
    Integer secondMax = null;
    Integer thirdMax = null;

    for (Integer num : nums) {
      if (num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) {
        continue;
      }

      if (firstMax == null || num > firstMax) {
        thirdMax = secondMax;
        secondMax = firstMax;
        firstMax = num;
      } else if (secondMax == null || num > secondMax) {
        thirdMax = secondMax;
        secondMax = num;
      } else if (thirdMax == null || num > thirdMax) {
        thirdMax = num;
      }
    }

    return thirdMax == null ? firstMax : thirdMax;
  }

}
