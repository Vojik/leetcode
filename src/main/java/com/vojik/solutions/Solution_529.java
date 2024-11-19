package com.vojik.solutions;

/**
 * 529. Minesweeper
 */
public class Solution_529 {

  private static final int[][] DIRECTIONS = new int[][]{{-1, 0}, {-1, -1}, {0, -1}, {1, -1}, {1, 0},
      {1, 1}, {0, 1}, {-1, 1}};

  public char[][] updateBoard(char[][] board, int[] click) {
    int x = click[0];
    int y = click[1];
    if (board[x][y] == 'M') {
      board[x][y] = 'X';
    } else {
      dfs(board, click[0], click[1]);
    }
    return board;
  }

  private void dfs(char[][] board, int row, int col) {
    if (isValidCell(board, row, col) && board[row][col] == 'E') {
      int num = getNumberOfBombs(board, row, col);
      if (num == 0) {
        board[row][col] = 'B';
        for (int[] dir : DIRECTIONS) {
          int x = row + dir[0];
          int y = col + dir[1];
          dfs(board, x, y);
        }
      } else {
        board[row][col] = (char) ('0' + num);
      }
    }
  }

  private int getNumberOfBombs(char[][] board, int row, int col) {
    int mines = 0;
    for (int[] dir : DIRECTIONS) {
      int x = row + dir[0];
      int y = col + dir[1];
      if (!isValidCell(board, x, y)) {
        continue;
      }
      if (board[x][y] == 'M' || board[x][y] == 'X') {
        mines++;
      }
    }
    return mines;
  }

  private boolean isValidCell(char[][] board, int row, int col) {
    return row >= 0 && col >= 0 && row < board.length && col < board[0].length;
  }
}
