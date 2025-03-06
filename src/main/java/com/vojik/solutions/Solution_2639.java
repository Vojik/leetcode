package com.vojik.solutions;

/**
 * 2639. Find the Width of Columns of a Grid
 */
public class Solution_2639 {

  // Time: O(n + m) Space: O(m)
  public int[] findColumnWidth(int[][] grid) {
    int[] ans = new int[grid[0].length];
    int k = 0;
    for (int i = 0; i < grid[0].length; i++) {
      int maxLen = 0;
      for (int j = 0; j < grid.length; j++) {
        int n = grid[j][i], len = 0;
        if (n <= 0) {
          len++;
        }
        while (n != 0) {
          n /= 10;
          len++;
        }
        maxLen = Math.max(len, maxLen);
      }
      ans[k++] = maxLen;
    }
    return ans;
  }
}
