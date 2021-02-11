package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_771Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(3, new Solution_771().numJewelsInStones("aA", "aAAbbbb"));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(0, new Solution_771().numJewelsInStones("z", "ZZ"));
  }

}