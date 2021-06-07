package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_96Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(5, new Solution_96().numTrees(3));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(14, new Solution_96().numTrees(4));
  }
}
