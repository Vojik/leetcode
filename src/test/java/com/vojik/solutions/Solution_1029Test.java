package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1029Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(1859,
        new Solution_1029().twoCitySchedCost(
            new int[][]{{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(110,
        new Solution_1029().twoCitySchedCost(
            new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}}));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(3086,
        new Solution_1029().twoCitySchedCost(
            new int[][]{{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779}, {457, 60},
                {650, 359}, {631, 42}}));
  }

}