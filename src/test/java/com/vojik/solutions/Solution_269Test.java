package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_269Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        "wertf", new Solution_269().alienOrder(new String[] {"wrt", "wrf", "er", "ett", "rftt"}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        "zx", new Solution_269().alienOrder(new String[] {"z","x"}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(
        "", new Solution_269().alienOrder(new String[] {"z","x","z"}));
  }
}
