package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_350Test {

  @Test
  public void test1_whenSolution1() {
    int[] actual = new Solution_350().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
    Assertions.assertArrayEquals(new int[]{2, 2}, actual);
  }

  @Test
  public void test2_whenSolution1() {
    int[] actual = new Solution_350().intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
    Assertions.assertArrayEquals(new int[]{9, 4}, actual);
  }

}