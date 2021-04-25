package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_787Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(200,
        new Solution_787()
            .findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 1));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(500,
        new Solution_787()
            .findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 0));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(11,
        new Solution_787()
            .findCheapestPrice(11,
                new int[][]{{0, 3, 3}, {3, 4, 3}, {4, 1, 3}, {0, 5, 1}, {5, 1, 100}, {0, 6, 2},
                    {6, 1, 100}, {0, 7, 1}, {7, 8, 1}, {8, 9, 1}, {9, 1, 1}, {1, 10, 1}, {10, 2, 1},
                    {1, 2, 100}}, 0, 2, 4));
  }


}
