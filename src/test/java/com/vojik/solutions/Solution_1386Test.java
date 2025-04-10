package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1386Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(4, new Solution_1386().maxNumberOfFamilies(3,
        new int[][] {{1, 2}, {1, 3}, {1, 8}, {2, 6}, {3, 1}, {3, 10}}));

    Assertions.assertEquals(2, new Solution_1386().maxNumberOfFamilies(2,
        new int[][] {{2, 1}, {1, 8}, {2, 6}}));

    Assertions.assertEquals(4, new Solution_1386().maxNumberOfFamilies(4,
        new int[][] {{4, 3}, {1, 4}, {4, 6}, {1, 7}}));
  }

}