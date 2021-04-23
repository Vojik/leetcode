package com.vojik.solutions;

import org.junit.jupiter.api.Test;

class Solution_353Test {

  @Test
  public void test1_whenSolution1() {
    Solution_353 snakeGame = new Solution_353(3, 2, new int[][]{{1, 2}, {0, 1}});
    snakeGame.move("R"); // return 0
    snakeGame.move("D"); // return 0
    snakeGame.move("R"); // return 1, snake eats the first piece of food. The second piece of food appears
    // at (0, 1).
    snakeGame.move("U"); // return 1
    snakeGame.move("L"); // return 2, snake eats the second food. No more food appears.
    snakeGame.move("U"); // return -1, game over because snake collides with border
  }

}