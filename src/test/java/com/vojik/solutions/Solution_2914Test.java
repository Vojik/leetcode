package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_2914Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_2914().minChanges("1001"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(1, new Solution_2914().minChanges("10"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(0, new Solution_2914().minChanges("0000"));
  }
}