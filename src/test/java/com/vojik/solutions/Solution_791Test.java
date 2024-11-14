package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_791Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("cbad", new Solution_791().customSortString("cba", "abcd"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("cbad", new Solution_791().customSortString("bcafg", "abcd"));
  }

}