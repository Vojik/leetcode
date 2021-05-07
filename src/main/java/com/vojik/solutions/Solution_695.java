package com.vojik.solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/** 695. Max Area of Island */
public class Solution_695 {
  private static final List<int[]> DIRECTIONS =
      List.of(new int[] {1, 0}, new int[] {0, 1}, new int[] {-1, 0}, new int[] {0, -1});

  // Time: O(n*m)
  // Space: O(n*m)
  public int maxAreaOfIsland(int[][] grid) {
    int maxArea = 0;
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1 && !visited[i][j]) {
          int land = bfs(grid, visited, i, j);
          maxArea = Math.max(land, maxArea);
        }
      }
    }
    return maxArea;
  }

  private int bfs(int[][] grid, boolean[][] visited, int i, int j) {
    int land = 1;
    visited[i][j] = true;
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[] {i, j});

    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int k = 0; k < size; k++) {
        int[] cell = queue.poll();
        for (int[] dir : DIRECTIONS) {
          int newI = cell[0] + dir[0];
          int newJ = cell[1] + dir[1];
          if (newI >= 0
              && newI < grid.length
              && newJ >= 0
              && newJ < grid[0].length
              && grid[newI][newJ] == 1
              && !visited[newI][newJ]) {
            visited[newI][newJ] = true;
            queue.add(new int[] {newI, newJ});
            land++;
          }
        }
      }
    }
    return land;
  }

  // Time: O(n*m)
  // Space: O(n*m)
  public int maxAreaOfIsland2(int[][] grid) {
    int maxArea = 0;
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1 && !visited[i][j]) {
          int land = dfs(grid, visited, i, j);
          maxArea = Math.max(land, maxArea);
        }
      }
    }
    return maxArea;
  }

  private int dfs(int[][] grid, boolean[][] visited, int i, int j) {
    if (i < 0
        || i >= grid.length
        || j < 0
        || j >= grid[0].length
        || grid[i][j] != 1
        || visited[i][j]) {
      return 0;
    }
    visited[i][j] = true;
    return 1
        + dfs(grid, visited, i + 1, j)
        + dfs(grid, visited, i - 1, j)
        + dfs(grid, visited, i, j + 1)
        + dfs(grid, visited, i, j - 1);
  }
}
