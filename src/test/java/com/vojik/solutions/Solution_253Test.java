package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_253Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_253().minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(1, new Solution_253().minMeetingRooms(new int[][]{{7, 10}, {2, 4}}));
  }
}