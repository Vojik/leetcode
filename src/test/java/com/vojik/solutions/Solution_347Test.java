package com.vojik.solutions;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_347Test {

  @Test
  public void test1_whenSolution1() {
    int[] actual = new Solution_347().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
    Arrays.sort(actual);
    Assertions.assertArrayEquals(new int[]{1, 2}, actual);
  }

  @Test
  public void test2_whenSolution1() {
    int[] actual = new Solution_347().topKFrequent(new int[]{1}, 1);
    Assertions.assertArrayEquals(new int[]{1}, actual);
  }

}