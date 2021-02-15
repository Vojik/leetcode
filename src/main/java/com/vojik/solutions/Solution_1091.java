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
  public int shortestPathBinaryMatrix(int[][] grid) {
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

}
