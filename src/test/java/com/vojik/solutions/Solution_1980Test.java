package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1980Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("00",
        new Solution_1980().findDifferentBinaryString(new String[] {"01", "10"}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("11",
        new Solution_1980().findDifferentBinaryString(new String[] {"00", "01"}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("000",
        new Solution_1980().findDifferentBinaryString(new String[] {"111", "011", "001"}));
  }


}