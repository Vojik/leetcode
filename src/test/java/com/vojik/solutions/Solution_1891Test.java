package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1891Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(5, new Solution_1891().maxLength(new int[]{9, 7, 5}, 3));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(4, new Solution_1891().maxLength(new int[]{7, 5, 9}, 4));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(0, new Solution_1891().maxLength(new int[]{5, 7, 9}, 22));
  }

}