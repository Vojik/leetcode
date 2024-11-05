package com.vojik.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1091. Shortest Path in Binary Matrix
 */
public class Solution_1091 {

  private static final int[][] DIRECTIONS = new int[][]{{1, 1}, {-1, 1}, {1, -1}, {0, 1}, {0, -1},
      {1, 0}, {-1, 0}, {-1, -1}};

  // Time: O(n) Space: O(n)
  public int shortestPathBinaryMatrix_bfs(int[][] grid) {
    int len = grid.length;
    if (grid[0][0] == 1 || grid[len - 1][len - 1] == 1) {
      return -1;
    }
    boolean[][] visited = new boolean[len][len];
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{0, 0});
    int level = 0;

    while (!queue.isEmpty()) {
      int size = queue.size();
      level++;
      for (int k = 0; k < size; k++) {
        int[] cell = queue.poll();
        if (cell[0] == len - 1 && cell[1] == len - 1) {
          return level;
        }

        if (visited[cell[0]][cell[1]]) {
          continue;
        }
        visited[cell[0]][cell[1]] = true;
        for (int[] dir : DIRECTIONS) {
          int nextX = cell[0] + dir[0];
          int nextY = cell[1] + dir[1];
          if (nextX >= 0 && nextY >= 0 && nextX < len && nextY < len && !visited[nextX][nextY]
              && grid[nextX][nextY] == 0) {
            queue.add(new int[]{nextX, nextY});
          }
        }
      }
    }
    return -1;
  }

  public int shortestPathBinaryMatrix_dfs_TLE(int[][] grid) {
    int n = grid[0].length;
    if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) {
      return -1;
    }

    int[][] seen = new int[n][n];

    dfs(grid, seen, n, 0, 0, 1);
    return seen[n - 1][n - 1] != 0 ? seen[n - 1][n - 1] : -1;
  }

  private void dfs(int[][] grid, int[][] seen, int n, int x, int y, int pathValue) {
    if (!isValidCell(x, y, n) || grid[x][y] != 0) {
      return;
    }

    if (seen[x][y] == 0 || seen[x][y] >= pathValue) {
      seen[x][y] = pathValue;
    } else if (seen[x][y] < pathValue) {
      return;
    }

    if (x == n - 1 && y == n - 1) {
      return;
    }

    for (int[] dir : DIRECTIONS) {
      dfs(grid, seen, n, x + dir[0], y + dir[1], pathValue + 1);
    }
  }

  private boolean isValidCell(int x, int y, int n) {
    return x >= 0 && x < n && y >= 0 && y < n;
  }

}
