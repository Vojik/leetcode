package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_154Test {

  @Test
  public void test1_whenSolution1() {
    int actual = new Solution_154().findMin(new int[]{2, 2, 2, 0, 1});
    assertEquals(0, actual);
  }

  @Test
  public void test2_whenSolution1() {
    int actual = new Solution_154().findMin(new int[]{3, 3, 1, 3});
    assertEquals(1, actual);
  }

  @Test
  public void test1_whenSolution2() {
    int actual = new Solution_154().findMin2(new int[]{2, 2, 2, 0, 1});
    assertEquals(0, actual);
  }

  @Test
  public void test2_whenSolution2() {
    int actual = new Solution_154().findMin2(new int[]{3, 3, 1, 3});
    assertEquals(1, actual);
  }

}