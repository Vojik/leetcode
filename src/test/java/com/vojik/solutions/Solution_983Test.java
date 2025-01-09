package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_983Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(11,
        new Solution_983().mincostTickets(new int[] {1, 4, 6, 7, 8, 20}, new int[] {2, 7, 15}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(17,
        new Solution_983().mincostTickets(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31},
            new int[] {2, 7, 15}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(6,
        new Solution_983().mincostTickets(new int[] {1, 4, 6, 7, 8, 20}, new int[] {7, 2, 15}));
  }

}