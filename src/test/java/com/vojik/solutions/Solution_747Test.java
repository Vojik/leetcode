package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_747Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(1, new Solution_747().dominantIndex(new int[]{3, 6, 1, 0}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(-1, new Solution_747().dominantIndex(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(-1, new Solution_747().dominantIndex(new int[]{0, 0, 3, 2}));
  }

}