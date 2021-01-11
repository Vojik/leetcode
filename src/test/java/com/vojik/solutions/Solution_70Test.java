package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution_70Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(3, new Solution_70().climbStairs(3));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_70().climbStairs(2));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(89, new Solution_70().climbStairs(10));
  }

}