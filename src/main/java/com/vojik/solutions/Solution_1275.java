package com.vojik.solutions;

/**
 * 1275. Find Winner on a Tic Tac Toe Game
 */
public class Solution_1275 {

  char[][] board = new char[3][3];

  public String tictactoe(int[][] moves) {
    for (int i = 0; i < moves.length; i++) {
      int r = moves[i][0];
      int c = moves[i][1];

      char ch = i % 2 == 0 ? 'X' : '0';
      board[r][c] = ch;
      if (isEnd(ch)) {
        return i % 2 == 0 ? "A" : "B";
      }
    }
    return moves.length == 9 ? "Draw" : "Pending";
  }

  private boolean isEnd(char ch) {
    for (int i = 0; i < 3; i++) {
      if (board[i][0] == ch && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
        return true;
      }
    }

    for (int i = 0; i < 3; i++) {
      if (board[0][i] == ch && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
        return true;
      }
    }

    if (board[0][0] == ch && board[0][0] == board[1][1] && board[0][0] == board[2][2]) return true;
    if (board[0][2] == ch && board[0][2] == board[1][1] && board[0][2] == board[2][0]) return true;
    return false;
  }
}