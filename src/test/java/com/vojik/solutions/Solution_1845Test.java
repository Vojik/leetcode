package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_1845Test {

  @Test
  public void test1_whenSolution1() {
    Solution_1845 seatManager = new Solution_1845(5);
    assertEquals(1, seatManager.reserve());
    assertEquals(2, seatManager.reserve());
    seatManager.unreserve(2);
    assertEquals(2, seatManager.reserve());
    assertEquals(3, seatManager.reserve());
    assertEquals(4, seatManager.reserve());
    assertEquals(5, seatManager.reserve());
  }

}