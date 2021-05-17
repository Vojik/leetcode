package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_215Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(5, new Solution_215().findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(4, new Solution_215().findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
  }
}
