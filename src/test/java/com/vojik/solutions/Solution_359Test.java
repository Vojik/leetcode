package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_359Test {

  @Test
  public void test1_whenSolution1() {
    Solution_359 logger = new Solution_359();
    assertTrue(logger.shouldPrintMessage(1, "foo"));  // return true, next allowed timestamp for "foo" is 1 + 10 = 11
    assertTrue(logger.shouldPrintMessage(2, "bar"));  // return true, next allowed timestamp for "bar" is 2 + 10 = 12
    assertFalse(logger.shouldPrintMessage(3, "foo"));  // 3 < 11, return false
    assertFalse(logger.shouldPrintMessage(8, "bar"));  // 8 < 12, return false
    assertFalse(logger.shouldPrintMessage(10, "foo")); // 10 < 11, return false
    assertTrue(logger.shouldPrintMessage(11, "foo")); // 11 >= 11, return true, next allowed timestamp for "foo" is
    // 11 + 10 = 21
  }

}