package com.vojik.solutions;

import java.util.Stack;

/**
 * 503. Next Greater Element II
 */
public class Solution_503 {

  public int[] nextGreaterElements(int[] nums) {
    int[] ans = new int[nums.length];
    int maxIdx = -1;
    int max = Integer.MIN_VALUE;
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
        maxIdx = i;
      }
    }

    nextGreaterElements(nums, maxIdx, 0, stack, ans);
    nextGreaterElements(nums, nums.length - 1, maxIdx + 1, stack, ans);

    return ans;
  }

  private void nextGreaterElements(int[] nums, int i, int end, Stack<Integer> stack, int[] ans) {
    while (i >= end) {
      while (!stack.isEmpty() && nums[i] >= stack.peek()) {
        stack.pop();
      }
      ans[i] = stack.isEmpty() ? -1 : stack.peek();
      stack.push(nums[i]);
      i--;
    }
  }
}
