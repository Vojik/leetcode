package com.vojik.solutions;

/**
 * 657. Robot Return to Origin
 */
public class Solution_657 {

  public boolean judgeCircle(String moves) {
    int vertical = 0;
    int horizontal = 0;

    for (int i = 0; i < moves.length(); i++) {
      char ch = moves.charAt(i);
      if (ch == 'R') {
        horizontal++;
      } else if (ch == 'L') {
        horizontal--;
      } else if (ch == 'U') {
        vertical++;
      } else if (ch == 'D') {
        vertical--;
      }
    }
    return vertical == 0 && horizontal == 0;
  }
}
