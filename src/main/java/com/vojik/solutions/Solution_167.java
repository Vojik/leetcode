package com.vojik.solutions;

/** 167. Two Sum II - Input array is sorted */
public class Solution_167 {

  // Time: O(n) Space: O(n)
  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {
      if (numbers[left] + numbers[right] == target) {
        return new int[]{left + 1, right + 1};
      } else if (numbers[left] + numbers[right] > target) {
        right--;
      } else {
        left++;
      }
    }
    return new int[]{};
  }

}
