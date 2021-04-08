package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_1647Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(0, new Solution_1647().minDeletions("aab"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_1647().minDeletions("aaabbbcc"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(2, new Solution_1647().minDeletions("ceabaacb"));
  }

}