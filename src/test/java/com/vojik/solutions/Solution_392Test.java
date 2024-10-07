package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_392Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_392().isSubsequence("abc", "ahbgdc"));
    assertFalse(new Solution_392().isSubsequence("axc", "ahbgdc"));
    assertFalse(new Solution_392().isSubsequence("aaaaaa", "bbaaaa"));
  }

}