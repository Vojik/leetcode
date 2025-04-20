package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1366Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("ACB",
        new Solution_1366().rankTeams(new String[] {"ABC", "ACB", "ABC", "ACB", "ACB"}));

    assertEquals("XWYZ",
        new Solution_1366().rankTeams(new String[] {"WXYZ", "XYZW"}));

    assertEquals("ZMNAGUEDSJYLBOPHRQICWFXTVK",
        new Solution_1366().rankTeams(new String[] {"ZMNAGUEDSJYLBOPHRQICWFXTVK"}));
  }
}