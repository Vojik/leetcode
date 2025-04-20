package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_2034Test {

  @Test
  public void test1_whenSolution1() {
    Solution_2034 solution = new Solution_2034();
    solution.update(1,10);
    solution.update(2,5);
    assertEquals(5, solution.current());
    assertEquals(10, solution.maximum());
    solution.update(1,3);
    assertEquals(5, solution.maximum());
    solution.update(4,2);
    assertEquals(2, solution.minimum());
  }

  @Test
  public void test2_whenSolution1() {
    Solution_2034 solution = new Solution_2034();
    solution.update(1,10);
    assertEquals(10, solution.current());
  }

}