package com.vojik.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 52. N-Queens II
 */
public class Solution_52 {

  private int n;
  private int numSolutions = 0;
  private int[][] diagonalOne;
  private int[][] diagonalTwo;
  private List<int[]> queens = new ArrayList<>();

  private void setUp(int n) {
    this.n = n;
    diagonalOne = new int[n][n];
    diagonalTwo = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        diagonalOne[i][j] = i + j;
        diagonalTwo[i][j] = n - 1 - i + j;
      }
    }
  }

  public int totalNQueens(int n) {
    setUp(n);
    totalNQueens(0, 0);
    return numSolutions;
  }

  private void totalNQueens(int row, int col) {
    if (row == n) {
      numSolutions++;
      return;
    }

    for (int i = col; i < n; i++) {
      if (canPutQueen(row, i)) {
        putQueen(row, i);
        totalNQueens(row + 1, 0);
        // backtrack, i.e. remove the queen and remove the attacking zone.
        removeQueen(row, i);
      }
    }
  }

  private boolean canPutQueen(int row, int col) {
    boolean verticalBusy = queens.stream().map(e -> e[1]).anyMatch(e -> e == col);
    if (verticalBusy) {
      return false;
    }

    boolean diagonalBusy = queens.stream()
        .anyMatch(e -> diagonalOne[e[0]][e[1]] == diagonalOne[row][col]
            || diagonalTwo[e[0]][e[1]] == diagonalTwo[row][col]);

    return !diagonalBusy;
  }

  private void putQueen(int row, int col) {
    queens.add(new int[]{row, col});
  }

  private void removeQueen(int row, int col) {
    queens.removeIf(queen -> queen[0] == row && queen[1] == col);
  }


  ////////////////////////////////////////

  private int count = 0;
  public int totalNQueensOptimal(int n) {
    boolean[] cols = new boolean[n];    // for col | validation
    boolean[] d1 = new boolean[2 * n];  // for diagonal \ validation
    boolean[] d2 = new boolean[2 * n];  // for diagonal / validation
    totalNQueens(n, 0, cols, d1, d2);
    return count;
  }


  private void totalNQueens(int n, int row, boolean[] cols, boolean[] d1, boolean[] d2) {
    if (row == n) {
      count++;
      return;
    }

    for (int col = 0; col < n; col++) {
      int id1 = col - row + n;
      int id2 = col + row;

      if (cols[col] || d1[id1] || d2[id2]) {
        continue;
      }

      cols[col] = true;
      d1[id1] = true;
      d2[id2] = true;

      totalNQueens(n, row + 1, cols, d1, d2);

      cols[col] = false;
      d1[id1] = false;
      d2[id2] = false;

    }
  }
}
