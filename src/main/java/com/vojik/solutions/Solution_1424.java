package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1424. Diagonal Traverse II
 */
public class Solution_1424 {

  // Time: O(N)
  // Space: O(N)
  public int[] findDiagonalOrder(List<List<Integer>> nums) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    int maxKey = 0;
    int n = 0;
    for (int i = nums.size() - 1; i >= 0; i--) {
      List<Integer> row = nums.get(i);
      for (int j = 0; j < row.size(); j++) {
        int key = i + j;
        if (!map.containsKey(key)) {
          map.put(key, new ArrayList<Integer>());
          maxKey = Math.max(maxKey, key);
        }
        map.get(key).add(row.get(j));
        n++;
      }
    }
    int[] ans = new int[n];
    int idx = 0;
    for (int i = 0; i <= maxKey; i++) {
      List<Integer> list = map.get(i);
      for (int j = 0; j < list.size(); j++) {
        ans[idx++] = list.get(j);
      }
    }
    return ans;
  }

  // Time: O(N)
  // Space: O(N)
  public int[] findDiagonalOrder2(List<List<Integer>> nums) {
    List<Integer> result = new ArrayList<>();
    Deque<int[]> queue = new ArrayDeque<>();
    queue.addFirst(new int[]{0, 0});
    while (!queue.isEmpty()) {
      int[] cell = queue.removeLast();
      int row = cell[0];
      int col = cell[1];
      result.add(nums.get(row).get(col));

      if (col == 0 && row + 1 < nums.size()) {
        queue.addFirst(new int[] {row + 1, col});
      }
      if (col + 1 < nums.get(row).size()) {
        queue.addFirst(new int[] {row, col + 1});
      }
    }
    int[] ans = new int[result.size()];
    int i = 0;
    for (int n : result) {
      ans[i++] = n;
    }
    return ans;
  }
}