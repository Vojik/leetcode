package com.vojik.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 286. Walls and Gates
 */
public class Solution_286 {

  private static final int[][] DIRECTIONS = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

  public void wallsAndGates(int[][] rooms) {
    Deque<int[]> deque = new ArrayDeque<>();
    for (int i = 0; i < rooms.length; i++) {
      for (int j = 0; j < rooms[0].length; j++) {
        if (rooms[i][j] == 0) {
          deque.addFirst(new int[] {i, j});
        }
      }
    }
    int level = 0;
    while (!deque.isEmpty()) {
      int size = deque.size();
      for (int k = 0; k < size; k++) {
        int[] candidate = deque.removeLast();
        int x = candidate[0];
        int y = candidate[1];
        if (rooms[x][y] > level) {
          rooms[x][y] = level;
        }

        for (int[] dir : DIRECTIONS) {
          int newX = x + dir[0];
          int newY = y + dir[1];
          if (newX < 0 || newY < 0 || newX >= rooms.length || newY >= rooms[0].length
              || rooms[newX][newY] != Integer.MAX_VALUE) {
            continue;
          }
          deque.addFirst(new int[] {newX, newY});
        }
      }
      level++;
    }

  }
}
