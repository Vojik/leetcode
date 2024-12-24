package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_2109Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("Leetcode Helps Me Learn",
        new Solution_2109().addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("i code in py thon",
        new Solution_2109().addSpaces("icodeinpython", new int[]{1, 5, 7, 9}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(" s p a c i n g",
        new Solution_2109().addSpaces("spacing", new int[]{0, 1, 2, 3, 4, 5, 6}));
  }

}