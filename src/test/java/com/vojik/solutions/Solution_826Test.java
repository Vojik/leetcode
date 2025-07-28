package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_826Test {

  @Test
  public void tests_whenSolution1() {
    assertEquals(100, new Solution_826().maxProfitAssignment(new int[] {2, 4, 6, 8, 10},
        new int[] {10, 20, 30, 40, 50}, new int[] {4, 5, 6, 7}));

    assertEquals(0, new Solution_826().maxProfitAssignment(new int[] {85, 47, 57},
        new int[] {24, 66, 99}, new int[] {40, 25, 25}));
  }

  @Test
  public void tests_whenSolution2() {
    assertEquals(100, new Solution_826().maxProfitAssignment2(new int[] {2, 4, 6, 8, 10},
        new int[] {10, 20, 30, 40, 50}, new int[] {4, 5, 6, 7}));

    assertEquals(0, new Solution_826().maxProfitAssignment2(new int[] {85, 47, 57},
        new int[] {24, 66, 99}, new int[] {40, 25, 25}));
  }

}