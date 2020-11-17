package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 *
 * <p>Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice
 * and others appear once.
 *
 * <p>Find all the elements of [1, n] inclusive that do not appear in this array.
 *
 * <p>Could you do it without extra space and in O(n) runtime? You may assume the returned list
 * does not count as extra space.
 *
 * <p>Example:
 * <p>Input: [4,3,2,7,8,2,3,1]
 * <p>Output: [5,6]
 */
public class Solution_448 {

  // Time: O(2n) Space: O(n)
  public List<Integer> findDisappearedNumbers1(int[] nums) {
    boolean[] counters = new boolean[nums.length + 1];
    List<Integer> result = new ArrayList();
    for (int num : nums) {
      counters[num] = true;
    }

    for (int i = 1; i < counters.length; i++) {
      if (!counters[i]) {
        result.add(i);
      }
    }
    return result;
  }

  // Time: O(3n) Space: O(1)
  public List<Integer> findDisappearedNumbers2(int[] nums) {
    List<Integer> result = new ArrayList();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > nums.length) {
        nums[i] = -1;
        continue;
      }
      if (nums[i] == i + 1) {
        continue;
      }
      int temp = nums[i];
      nums[i] = -1;
      helper(nums, temp);
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == -1) {
        result.add(i + 1);
      }
    }
    return result;
  }

  private void helper(int[] nums, int num) {
    if (num > nums.length) {
      return;
    }

    if (nums[num - 1] == num) {
      return;
    }

    int temp = nums[num - 1];
    nums[num - 1] = num;
    if (temp != -1) {
      helper(nums, temp);
    }
  }
}
