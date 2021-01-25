package com.vojik.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 36. Valid Sudoku
 */
public class Solution_36 {

  // Time: O(1) Space: O(1)
  public boolean isValidSudokuOptimal(char[][] board) {

    Map<Integer, Integer>[] rows = new HashMap[9];
    Map<Integer, Integer>[] cols = new HashMap[9];
    Map<Integer, Integer>[] boxes = new HashMap[9];

    for (int i = 0; i < 9; i++) {
      rows[i] = new HashMap<>();
      cols[i] = new HashMap<>();
      boxes[i] = new HashMap<>();
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {

        char ch = board[i][j];

        if (ch != '.') {
          int num = (int) board[i][j];
          int boxNum = (i / 3) * 3 + (j / 3);
          rows[i].put(num, rows[i].getOrDefault(num, 0) + 1);
          cols[j].put(num, cols[j].getOrDefault(num, 0) + 1);
          boxes[boxNum].put(num, boxes[boxNum].getOrDefault(num, 0) + 1);

          if (rows[i].get(num) > 1 || cols[j].get(num) > 1 || boxes[boxNum].get(num) > 1) {
            return false;
          }
        }
      }
    }
    return true;
  }

  //////////////////

  // Time: O(1) Space: O(1)
  public boolean isValidSudoku(char[][] board) {
    boolean[] horizontal = new boolean[10];
    boolean[] vertical = new boolean[10];

    for (int i = 0; i < 9; i++) {
      horizontal = new boolean[10];
      vertical = new boolean[10];
      for (int j = 0; j < 9; j++) {

        int hNum = getNum(board[i][j]);
        if (hNum != -1) {
          if (horizontal[hNum]) {
            return false;
          }
          horizontal[hNum] = true;
        }

        int vNum = getNum(board[j][i]);
        if (vNum != -1) {
          if (vertical[vNum]) {
            return false;
          }
          vertical[vNum] = true;
        }

        if ((i + 1) % 3 == 0 && (j + 1) % 3 == 0) {
          if (!validateSubBox(board, i, j)) {
            return false;
          }
        }

      }
    }
    return true;
  }

  private boolean validateSubBox(char[][] board, int endX, int endY) {
    boolean[] matrix = new boolean[10];
    for (int i = 2; i >= 0; i--) {
      for (int j = 2; j >= 0; j--) {
        int num = getNum(board[endX - i][endY - j]);
        if (num != -1) {
          if (matrix[num]) {
            return false;
          }
          matrix[num] = true;
        }
      }
    }
    return true;
  }

  private int getNum(char ch) {
    return Character.isDigit(ch) ? Character.getNumericValue(ch) : -1;
  }
}