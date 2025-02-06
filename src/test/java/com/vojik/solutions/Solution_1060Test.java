package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1060Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        5, new Solution_1060().missingElement(new int[] {4, 7, 9, 10}, 1));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        8, new Solution_1060().missingElement(new int[] {4, 7, 9, 10}, 3));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(
        6, new Solution_1060().missingElement(new int[] {1, 2, 4}, 3));
  }

  @Test
  public void test4_whenSolution1() {
    Assertions.assertEquals(
        746431, new Solution_1060().missingElement(
            new int[] {746421, 1033196, 1647541, 4775111, 7769817, 8030384}, 10));
  }

}