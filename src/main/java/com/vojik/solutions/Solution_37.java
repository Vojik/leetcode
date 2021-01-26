package com.vojik.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 37. Sudoku Solver
 */
public class Solution_37 {

  public void solveSudoku(char[][] board) {
    Set<Integer>[] rows = new HashSet[9];
    Set<Integer>[] cols = new HashSet[9];
    Set<Integer>[] boxes = new HashSet[9];

    for (int i = 0; i < 9; i++) {
      rows[i] = new HashSet<>();
      cols[i] = new HashSet<>();
      boxes[i] = new HashSet<>();
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        char ch = board[i][j];
        if (Character.isDigit(ch)) {
          int num = Character.getNumericValue(ch);
          int boxNum = (i / 3) * 3 + j / 3;
          rows[i].add(num);
          cols[j].add(num);
          boxes[boxNum].add(num);
        }
      }
    }
    backtracking(board, 0, 0, rows, cols, boxes);
  }


  private boolean backtracking(char[][] board, int row, int col, Set<Integer>[] rows,
      Set<Integer>[] cols, Set<Integer>[] boxes) {
    if (row == 9) {
      return true;
    }

    for (; col < 9; col++) {
      if (board[row][col] == '.') {
        int boxNum = (row / 3) * 3 + col / 3;
        for (int num = 1; num <= 9; num++) {
          if (!rows[row].contains(num) && !cols[col].contains(num) && !boxes[boxNum]
              .contains(num)) {
            // put
            board[row][col] = (char) (num + '0');
            rows[row].add(num);
            cols[col].add(num);
            boxes[boxNum].add(num);

            if (backtracking(board, row, col + 1, rows, cols, boxes)) {
              return true;
            }

            // remove
            board[row][col] = '.';
            rows[row].remove(num);
            cols[col].remove(num);
            boxes[boxNum].remove(num);
          }
        }
      }
    }
    return rows[row].size() == 9 && backtracking(board, row + 1, 0, rows, cols, boxes);
  }
}
