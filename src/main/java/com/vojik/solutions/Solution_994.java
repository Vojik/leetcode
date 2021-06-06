package com.vojik.solutions;

import java.util.LinkedList;
import java.util.Queue;

/** 994. Rotting Oranges */
public class Solution_994 {

  private static final int[][] DIRECTIONS = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

  public int orangesRotting(int[][] grid) {
    Queue<int[]> queue = new LinkedList<>();
    boolean[][] seen = new boolean[grid.length][grid[0].length];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 2) {
          queue.add(new int[] {i, j});
        }
      }
    }
    int minutes = dfs(grid, queue, seen);
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1 && !seen[i][j]) {
          return -1;
        }
      }
    }
    return minutes;
  }

  private int dfs(int[][] grid, Queue<int[]> queue, boolean[][] seen) {
    if (queue.isEmpty()) {
      return 0;
    }
    int level = -1;

    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int k = 0; k < size; k++) {
        int[] current = queue.poll();
        for (int[] d : DIRECTIONS) {
          int x = current[0] + d[0];
          int y = current[1] + d[1];
          if (isInGrid(grid, x, y) && grid[x][y] == 1 && !seen[x][y]) {
            seen[x][y] = true;
            queue.add(new int[] {x, y});
          }
        }
      }
      level++;
    }
    return level;
  }

  private boolean isInGrid(int[][] grid, int i, int j) {
    return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length;
  }
}
