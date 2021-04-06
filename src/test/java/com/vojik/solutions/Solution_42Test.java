package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_42Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(6, new Solution_42().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(9, new Solution_42().trap(new int[]{4,2,0,3,2,5}));
  }

}