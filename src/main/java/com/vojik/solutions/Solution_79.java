package com.vojik.solutions;

import java.util.List;

/** 79. Word Search */
public class Solution_79 {
  private static final List<int[]> DIRECTIONS =
      List.of(new int[] {-1, 0}, new int[] {1, 0}, new int[] {0, 1}, new int[] {0, -1});

  public boolean exist(char[][] board, String word) {
    char firstLetter = word.charAt(0);
    boolean[][] visited = new boolean[board.length][board[0].length];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == firstLetter) {
          if (dfs(word, 0, board, i, j, visited)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private boolean dfs(String word, int pos, char[][] board, int i, int j, boolean[][] visited) {
    if (pos == word.length()) {
      return true;
    } else {
      if (!isOnBoard(board, i, j) || visited[i][j] || word.charAt(pos) != board[i][j]) {
        return false;
      }

      visited[i][j] = true;
      for (int[] dir : DIRECTIONS) {
        int x = i + dir[0];
        int y = j + dir[1];
        if (dfs(word, pos + 1, board, x, y, visited)) {
          return true;
        }

      }
      visited[i][j] = false;
    }
    return false;
  }

  private boolean isOnBoard(char[][] board, int i, int j) {
    return i >= 0 && i < board.length && j >= 0 && j < board[0].length;
  }
}
