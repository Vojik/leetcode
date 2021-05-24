package com.vojik.solutions;

/** 130. Surrounded Regions */
public class Solution_130 {

  private static final int[][] DIRECTIONS = new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

  public void solve(char[][] board) {
    boolean[][] seen = new boolean[board.length][board[0].length];
    int rows = board.length;
    int cols = board[0].length;
    for (int j = 0; j < board[0].length; j++) {
      if (board[0][j] == 'O' && !seen[0][j]) {
        dfs(board, 0, j, seen);
      }
      if (board[rows - 1][j] == 'O' && !seen[rows - 1][j]) {
        dfs(board, rows - 1, j, seen);
      }
    }

    for (int i = 1; i < board.length - 1; i++) {
      if (board[i][0] == 'O' && !seen[i][0]) {
        dfs(board, i, 0, seen);
      }
      if (board[i][cols - 1] == 'O' && !seen[i][cols - 1]) {
        dfs(board, i, cols - 1, seen);
      }
    }

    for (int i = 1; i < rows; i++) {
      for (int j = 1; j < cols - 1; j++) {
        if (!seen[i][j]) {
          board[i][j] = 'X';
        }
      }
    }
  }

  private void dfs(char[][] board, int i, int j, boolean[][] seen) {
    seen[i][j] = true;
    for (int[] dir : DIRECTIONS) {
      int x = i + dir[0];
      int y = j + dir[1];
      if (x >= 0
          && y >= 0
          && x < board.length
          && y < board[0].length
          && !seen[x][y]
          && board[x][y] == 'O') {
        dfs(board, x, y, seen);
      }
    }
  }
}
