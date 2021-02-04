package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_594Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(5, new Solution_594().findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_594().findLHS(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(0, new Solution_594().findLHS(new int[]{1,1,1,1}));
  }

}