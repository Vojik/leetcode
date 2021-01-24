package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_912Test {

  @Test
  public void test1_whenSolution1() {
    int[] actual = new Solution_912().sortArray(new int[]{5, 2, 3, 1, 4});
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, actual);
  }

  @Test
  public void test2_whenSolution1() {
    int[] actual = new Solution_912().sortArray(new int[]{5, 2, 3, 1});
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 5}, actual);
  }

  @Test
  public void test1_whenSolution2() {
    int[] actual = new Solution_912().sortArrayIteratively(new int[]{5, 2, 3, 1, 4});
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, actual);
  }

  @Test
  public void test2_whenSolution2() {
    int[] actual = new Solution_912().sortArrayIteratively(new int[]{5, 2, 3, 1});
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 5}, actual);
  }

  @Test
  public void test1_whenSolution3() {
    int[] input = new int[]{5, 2, 3, 1, 4};
    new Solution_912().quickSort(input);
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, input);
  }

  @Test
  public void test2_whenSolution3() {
    int[] input = new int[]{5, 2, 3, 1};
    new Solution_912().quickSort(input);
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 5}, input);
  }

}