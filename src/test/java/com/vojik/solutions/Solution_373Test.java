package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_373Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        List.of(
            List.of(1, 2),
            List.of(1, 4),
            List.of(1, 6)
        ),
        new Solution_373().kSmallestPairs(new int[] {1, 7, 11}, new int[] {2, 4, 6}, 3));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        List.of(
            List.of(1, 1),
            List.of(1, 1)
        ),
        new Solution_373().kSmallestPairs(new int[] {1, 1, 2}, new int[] {1, 2, 3}, 2));
  }

}