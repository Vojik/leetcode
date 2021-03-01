package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_575Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(3, new Solution_575().distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_575().distributeCandies(new int[]{1, 1, 2, 3}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(1, new Solution_575().distributeCandies(new int[]{6, 6, 6, 6}));
  }

}