package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_716Test {

  @Test
  public void test1_whenSolution1() {
    Solution_716 solution = new Solution_716();
    solution.push(5);
    solution.push(1);
    solution.push(5);
    assertEquals(5, solution.top());
    assertEquals(5, solution.popMax());
    assertEquals(1, solution.top());
    assertEquals(5, solution.peekMax());
    assertEquals(1, solution.pop());
    assertEquals(5, solution.top());
  }

}