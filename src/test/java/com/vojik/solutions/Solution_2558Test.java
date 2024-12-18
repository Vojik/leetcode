package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_2558Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(29, new Solution_2558().pickGifts(new int[]{25, 64, 9, 4, 100}, 4));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(4, new Solution_2558().pickGifts(new int[]{1, 1, 1, 1}, 4));
  }
}