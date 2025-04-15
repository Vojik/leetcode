package com.vojik.solutions;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1926. Nearest Exit from Entrance in Maze
 */
public class Solution_1926 {

  public int nearestExit(char[][] maze, int[] entrance) {
    Deque<int[]> queue = new ArrayDeque<>();
    queue.addFirst(new int[] {entrance[0], entrance[1], 0});
    maze[entrance[0]][entrance[1]] = '+';
    int[][] directions = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    while (!queue.isEmpty()) {
      int[] cell = queue.removeLast();

      for (int[] dir : directions) {
        int newRow = cell[0] + dir[0];
        int newCol = cell[1] + dir[1];
        if (canGo(newRow, newCol, maze)) {
          if (isExit(newRow, newCol, maze)) {
            return cell[2] + 1;
          }
          maze[newRow][newCol] = '+';
          queue.addFirst(new int[] {newRow, newCol, cell[2] + 1});
        }
      }
    }
    return -1;
  }

  private boolean isExit(int r, int c, char[][] maze) {
    return r == 0 || r == maze.length - 1 || c == 0 || c == maze[0].length - 1;
  }

  private boolean canGo(int r, int c, char[][] maze) {
    return r >= 0 && r < maze.length && c >= 0 && c < maze[0].length && maze[r][c] == '.';
  }
}


