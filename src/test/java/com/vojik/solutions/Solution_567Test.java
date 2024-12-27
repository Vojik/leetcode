package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_567Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_567().checkInclusion("ab", "eidbaooo"));
    assertFalse(new Solution_567().checkInclusion("ab", "eidboaoo"));
  }

}