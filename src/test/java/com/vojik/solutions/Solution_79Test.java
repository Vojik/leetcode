package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_79Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_79().exist(new char[][] {{'a', 'b'}, {'c', 'd'}}, "cdba"));
  }

  @Test
  public void test2_whenSolution1() {
    assertTrue(
        new Solution_79()
            .exist(
                new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}},
                "ABCESEEEFS"));
  }
}
