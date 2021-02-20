package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_881Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(1,
        new Solution_881().numRescueBoats(new int[]{1, 2}, 3));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(3,
        new Solution_881().numRescueBoats(new int[]{3, 2, 2, 1}, 3));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(4,
        new Solution_881().numRescueBoats(new int[]{3, 5, 3, 4}, 5));
  }
}