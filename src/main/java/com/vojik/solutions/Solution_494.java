package com.vojik.solutions;

import java.util.Stack;

/**
 * 494. Target Sum
 *
 * <p>You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have
 * 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.
 *
 * <p>Find out how many ways to assign symbols to make sum of integers equal to target S.
 *
 * <p>Example 1:
 *
 * <p>Input: nums is [1, 1, 1, 1, 1], S is 3. Output: 5 Explanation:
 *
 * <p>-1+1+1+1+1 = 3 +1-1+1+1+1 = 3 +1+1-1+1+1 = 3 +1+1+1-1+1 = 3 +1+1+1+1-1 = 3
 *
 * <p>There are 5 ways to assign symbols to make the sum of nums be target 3.
 *
 * <p>Constraints:
 *
 * <p>The length of the given array is positive and will not exceed 20. The sum of elements in the
 * given array will not exceed 1000. Your output answer is guaranteed to be fitted in a 32-bit
 * integer.
 */
public class Solution_494 {

  // Time: O(n^2) Space: O(n)
  public int findTargetSumWays(int[] nums, int S) {
    int count = 0;
    int size = nums.length - 1;
    Stack<int[]> stack = new Stack<>();
    stack.push(new int[]{0, -nums[0]});
    stack.push(new int[]{0, nums[0]});

    while (!stack.empty()) {
      int[] cur = stack.pop();

      if (cur[0] == size) {
        if (cur[1] == S) {
          count++;
        }
        continue;
      }
      int idx = cur[0] + 1;
      stack.push(new int[]{idx, cur[1] - nums[idx]});
      stack.push(new int[]{idx, cur[1] + nums[idx]});
    }
    return count;
  }

  private int count = 0;

  // Time: O(n^2) Space: O(n)
  public int findTargetSumWays2(int[] nums, int S) {
    calc(0, nums, 0, S);
    return count;
  }

  private boolean calc(int i, int[] nums, int sum, int S) {
    if (i == nums.length) {
      return sum == S;
    }

    if (calc(i + 1, nums, sum + nums[i], S)) {
      count++;
    }
    if (calc(i + 1, nums, sum - nums[i], S)) {
      count++;
    }
    return false;
  }
}
