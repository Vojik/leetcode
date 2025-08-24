package com.vojik.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 874. Walking Robot Simulation
 */
public class Solution_874 {

  public int robotSim(int[] commands, int[][] obstacles) {
    Set<String> hashedObstacles = new HashSet<>();
    for (int[] obstcl : obstacles) {
      hashedObstacles.add(hashCoordinate(obstcl[0], obstcl[1]));
    }

    int ans = 0;
    int[][] direction = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int currentDirection = 0;
    int x = 0, y = 0;

    for (int command : commands) {
      if (command == -2) {
        currentDirection = currentDirection == 0 ? 3 : currentDirection - 1;
      } else if (command == -1) {
        currentDirection = currentDirection == 3 ? 0 : currentDirection + 1;
      } else {
        while (command > 0) {
          int nextX = direction[currentDirection][0] + x;
          int nextY = direction[currentDirection][1] + y;
          String hash = hashCoordinate(nextX, nextY);
          if (hashedObstacles.contains(hash)) {
            break;
          }
          x = nextX;
          y = nextY;
          command--;
        }
        ans = Math.max(ans, x * x + y * y);
      }
    }
    return ans;
  }

  private String hashCoordinate(int x, int y) {
    return "" + x + "%" + y;
  }
}
