package com.vojik.solutions;

import java.util.LinkedList;
import java.util.Queue;

/** 1197. Minimum Knight Moves */
public class Solution_1197 {

  public int minKnightMoves(int x, int y) {
    int[][] directions = new int[][] {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2},
        {2, -1}};

    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[] {0, 0});
    boolean[][] visited = new boolean[607][607];
    visited[0][0] = true;
    int level = 0;

    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        int[] current = queue.poll();
        if (current[0] == x && current[1] == y) {
          return level;
        }

        for (int[] dir : directions) {
          int newX = current[0] + dir[0];
          int newY = current[1] + dir[1];

          if (!visited[newX + 302][newY + 302]) {
            visited[newX + 302][newY + 302] = true;
            queue.add(new int[] {newX, newY});
          }
        }
      }
      level++;
    }
    return level;
  }
}
