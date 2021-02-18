package com.vojik.solutions;

/**
 * 11. Container With Most Water
 */
public class Solution_11 {

  // Time: O(n) Space: O(1)
  public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
      int s = (right - left) * Math.min(height[left], height[right]);
      maxArea = Math.max(maxArea, s);
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return maxArea;
  }
}
