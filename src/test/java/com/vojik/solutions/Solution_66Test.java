package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_66Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new int[]{1, 2, 4}, new Solution_66().plusOne(new int[]{1, 2, 3}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new int[]{1, 3, 0}, new Solution_66().plusOne(new int[]{1, 2, 9}));
  }

  @Test
  public void test3_whenSolution1() {
    assertArrayEquals(new int[]{1}, new Solution_66().plusOne(new int[]{0}));
  }

  @Test
  public void test4_whenSolution1() {
    assertArrayEquals(new int[]{1, 0, 0, 0}, new Solution_66().plusOne(new int[]{9, 9, 9}));
  }
}