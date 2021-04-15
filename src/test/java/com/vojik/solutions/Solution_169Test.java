package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_169Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(3, new Solution_169().majorityElement(new int[]{3, 2, 3}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(2, new Solution_169().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
  }

}