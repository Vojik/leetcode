package com.vojik.solutions;

/**
 * 1041. Robot Bounded In Circle
 */
public class Solution_1041 {

  public boolean isRobotBounded(String instructions) {
    // up, left, down, right
    int[][] directions = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    int idx = 0;
    int i = 0;
    int j = 0;
    for (int k = 0; k < instructions.length(); k++) {
      char ch = instructions.charAt(k);
      if (ch == 'G') {
        i += directions[idx][0];
        j += directions[idx][1];
      } else if (ch == 'L') {
        idx = (idx + 1) % directions.length;
      } else if (ch == 'R') {
        idx = (idx + 3) % directions.length;
      }
    }

    return (i == 0 && j == 0) || (idx != 0);
  }
}
