package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 2352. Equal Row and Column Pairs
 */
public class Solution_2352 {

  public int equalPairs(int[][] grid) {
    int n = grid.length;
    Map<String, Integer> hashedRowsToCount = new HashMap<>();
    int count = 0;
    for (int i = 0; i < n; i++) {
      StringBuilder row = new StringBuilder();
      for (int j = 0; j < n; j++) {
        row.append(grid[i][j]);
        row.append("/");
      }
      String hash = row.toString();
      hashedRowsToCount.put(hash, hashedRowsToCount.getOrDefault(hash, 0) + 1);
    }

    for (int i = 0; i < n; i++) {
      StringBuilder row = new StringBuilder();
      for (int j = 0; j < n; j++) {
        row.append(grid[j][i]);
        row.append("/");
      }
      String hash = row.toString();
      if (hashedRowsToCount.containsKey(hash)) {
        count += hashedRowsToCount.get(hash);
      }
    }
    return count;
  }
}
