package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_703Test {

  @Test
  public void test1_solution1() {
    Solution_703 solution = new Solution_703(3, new int[]{4, 5, 8, 2});
    assertEquals(4, solution.add(3));
    assertEquals(5, solution.add(5));
    assertEquals(5, solution.add(10));
    assertEquals(8, solution.add(9));
    assertEquals(8, solution.add(4));
  }

  @Test
  public void test1_solution2() {
    Solution_703WithPriorityQueue solution = new Solution_703WithPriorityQueue(3, new int[]{4, 5, 8, 2});
    assertEquals(4, solution.add(3));
    assertEquals(5, solution.add(5));
    assertEquals(5, solution.add(10));
    assertEquals(8, solution.add(9));
    assertEquals(8, solution.add(4));
  }

}