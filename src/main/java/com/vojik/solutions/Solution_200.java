package com.vojik.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 200. Number of Islands
 *
 * <p>Given an m x n 2d grid map of '1's (land) and '0's (water), return the number of islands.
 *
 * <p>An island is surrounded by water and is formed by connecting adjacent lands horizontally or
 * vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 * <p>Example 1:
 *
 * <p>Input: grid = [ ["1","1","1","1","0"], ["1","1","0","1","0"], ["1","1","0","0","0"],
 * ["0","0","0","0","0"] ] Output: 1 Example 2:
 *
 * <p>Input: grid = [ ["1","1","0","0","0"], ["1","1","0","0","0"], ["0","0","1","0","0"],
 * ["0","0","0","1","1"] ] Output: 3
 *
 * <p>Constraints:
 *
 * <p>m == grid.length n == grid[i].length 1 <= m, n <= 300 grid[i][j] is '0' or '1'.
 */
public class Solution_200 {

  private final static int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

  //Time: O(mn) Space: O(min{(M, N)})
  public int numIslands1(char[][] grid) {
    int count = 0;

    int m = grid.length;
    int n = grid[0].length;

    boolean[][] visited = new boolean[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '1' && !visited[i][j]) {
          dfs(i, j, grid, visited);
          count++;
        }
      }
    }
    return count;
  }

  private void dfs(int i, int j, char[][] grid, boolean[][] visited) {
    if (i < 0
        || i >= grid.length
        || j < 0
        || j >= grid[0].length
        || visited[i][j]
        || grid[i][j] == '0') {
      return;
    }
    visited[i][j] = true;
    dfs(i + 1, j, grid, visited);
    dfs(i - 1, j, grid, visited);
    dfs(i, j + 1, grid, visited);
    dfs(i, j - 1, grid, visited);
  }


  //Time: O(mn) Space: O(min{(M, N)})
  public int numIslands2(char[][] grid) {
    int count = 0;

    int m = grid.length;
    int n = grid[0].length;

    boolean[][] visited = new boolean[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '1' && !visited[i][j]) {
          dfs2(i, j, grid, visited);
          count++;
        }
      }
    }
    return count;
  }

  private void dfs2(int i, int j, char[][] grid, boolean[][] visited) {
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{i, j});
    visited[i][j] = true;
    while (!queue.isEmpty()) {
      int[] cell = queue.poll();

      for (int[] direction : DIRECTIONS) {

        int m = cell[0] + direction[0];
        int n = cell[1] + direction[1];

        if (m >= 0 && m < grid.length && n >= 0 && n < grid[0].length) {
          if (!visited[m][n] && grid[m][n] == '1') {
            visited[m][n] = true;
            queue.add(new int[]{m, n});
          }
        }
      }
    }
  }
}
