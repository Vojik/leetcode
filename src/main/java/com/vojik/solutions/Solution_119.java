package com.vojik.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 119. Pascal's Triangle II
 */
public class Solution_119 {

  // Time: O(nlog(n)) Space: O(nlog(n))
  public List<Integer> getRow(int rowIndex) {
    List<Integer> result = new ArrayList<>();
    Map<String, Integer> visited = new HashMap<>();
    result.add(1);

    if (rowIndex == 0) {
      return result;
    }

    for (int i = 1; i <= rowIndex; i++) {
      result.add(helper(rowIndex, i, visited));
    }

    return result;
  }

  private int helper(int row, int idx, Map<String, Integer> visited) {
    if (idx == 0 || idx == row) {
      return 1;
    }
    String key = String.format("%d%d", row, idx);
    Integer fromCache = visited.get(key);
    if (fromCache != null) {
      return fromCache;
    }

    int result = helper(row - 1, idx - 1, visited)
        + helper(row - 1, idx, visited);
    visited.put(key, result);
    return result;
  }
}
