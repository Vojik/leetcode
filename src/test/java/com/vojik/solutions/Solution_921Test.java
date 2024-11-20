package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_921Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(1, new Solution_921().minAddToMakeValid("())"));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(3, new Solution_921().minAddToMakeValid("((("));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(0, new Solution_921().minAddToMakeValid("((()))"));
  }

}