package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_556Test {

  @Test
  public void tests_whenSolution() {
    assertEquals(21, new Solution_556().nextGreaterElement(12));
    assertEquals(-1, new Solution_556().nextGreaterElement(21));
    assertEquals(158513467, new Solution_556().nextGreaterElement(158476531));
  }

}