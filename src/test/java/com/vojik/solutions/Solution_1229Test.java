package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_1229Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        List.of(60, 68), new Solution_1229()
            .minAvailableDuration(new int[][]{{10, 50}, {60, 120}, {140, 210}},
                new int[][]{{0, 15}, {60, 70}}, 8));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        List.of(), new Solution_1229()
            .minAvailableDuration(new int[][]{{10, 50}, {60, 120}, {140, 210}},
                new int[][]{{0, 15}, {60, 70}}, 12));
  }

}