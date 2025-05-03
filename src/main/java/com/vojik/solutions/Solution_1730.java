package com.vojik.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1730. Shortest Path to Get Food
 */
public class Solution_1730 {

  public int getFood(char[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    Queue<int[]> queue = new LinkedList<>();
    queue.add(findYourLocation(grid));

    int[][] directions = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    int ans = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int k = 0; k < size; k++) {
        int[] cell = queue.poll();
        for (int[] dir : directions) {
          int new_r = cell[0] + dir[0];
          int new_c = cell[1] + dir[1];
          if (new_r >= 0 && new_r < m && new_c >= 0 && new_c < n && grid[new_r][new_c] != 'X') {
            if (grid[new_r][new_c] == '#') {
              return ans + 1;
            }
            grid[new_r][new_c] = 'X';
            queue.add(new int[] {new_r, new_c});
          }
        }
      }
      ans++;
    }
    return -1;
  }


  private int[] findYourLocation(char[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '*') {
          return new int[] {i, j};
        }
      }
    }
    throw new RuntimeException("Invalid input");
  }
}
