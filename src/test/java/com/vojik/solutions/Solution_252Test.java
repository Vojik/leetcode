package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_252Test {

  @Test
  public void test1_whenSolution1() {
    assertFalse(new Solution_252().canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertTrue(new Solution_252().canAttendMeetings(new int[][]{{7,10}, {2, 4}}));
  }
}