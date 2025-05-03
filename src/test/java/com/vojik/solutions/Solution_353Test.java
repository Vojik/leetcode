package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_353Test {

  @Test
  public void test1_whenSolution1() {
    Solution_353 snakeGame = new Solution_353(3, 2, new int[][] {{1, 2}, {0, 1}});
    Assertions.assertEquals(0, snakeGame.move("R"));
    Assertions.assertEquals(0, snakeGame.move("D"));
    Assertions.assertEquals(1, snakeGame.move("R"));
    Assertions.assertEquals(1, snakeGame.move("U"));
    Assertions.assertEquals(2, snakeGame.move("L"));
    Assertions.assertEquals(-1, snakeGame.move("U"));
  }

  @Test
  public void test2_whenSolution1() {
    Solution_353 snakeGame = new Solution_353(2, 2, new int[][] {{0, 1}});
    Assertions.assertEquals(1, snakeGame.move("R"));
    Assertions.assertEquals(1, snakeGame.move("D"));
  }

  @Test
  public void test3_whenSolution1() {
    Solution_353 snakeGame = new Solution_353(3, 3,
        new int[][] {{2, 0}, {0, 0}, {0, 2}, {0, 1}, {2, 2}, {0, 1}});
    Assertions.assertEquals(0, snakeGame.move("D"));
    Assertions.assertEquals(1, snakeGame.move("D"));
    Assertions.assertEquals(1, snakeGame.move("R"));
    Assertions.assertEquals(1, snakeGame.move("U"));
    Assertions.assertEquals(1, snakeGame.move("U"));
    Assertions.assertEquals(2, snakeGame.move("L"));
    Assertions.assertEquals(2, snakeGame.move("D"));
    Assertions.assertEquals(2, snakeGame.move("R"));
    Assertions.assertEquals(2, snakeGame.move("R"));
    Assertions.assertEquals(3, snakeGame.move("U"));
    Assertions.assertEquals(4, snakeGame.move("L"));
    Assertions.assertEquals(4, snakeGame.move("L"));
    Assertions.assertEquals(4, snakeGame.move("D"));
    Assertions.assertEquals(4, snakeGame.move("R"));
    Assertions.assertEquals(-1, snakeGame.move("U"));
  }
}