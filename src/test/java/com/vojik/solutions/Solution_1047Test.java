package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1047Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("ca", new Solution_1047().removeDuplicates("abbaca"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("ay", new Solution_1047().removeDuplicates("azxxzy"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("cb", new Solution_1047().removeDuplicates("bbaacaab"));
  }
}
