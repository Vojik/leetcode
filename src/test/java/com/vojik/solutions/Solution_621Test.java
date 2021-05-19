package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_621Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        8, new Solution_621().leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 2));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        6, new Solution_621().leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 0));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(
        16,
        new Solution_621()
            .leastInterval(
                new char[] {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2));
  }
}
