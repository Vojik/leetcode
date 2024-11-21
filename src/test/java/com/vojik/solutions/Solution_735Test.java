package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_735Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertArrayEquals(new int[]{5, 10},
        new Solution_735().asteroidCollision(new int[]{5, 10, -5}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertArrayEquals(new int[]{},
        new Solution_735().asteroidCollision(new int[]{8, -8}));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertArrayEquals(new int[]{10},
        new Solution_735().asteroidCollision(new int[]{10, 2, -5}));
  }

  @Test
  public void test4_whenSolution1() {
    Assertions.assertArrayEquals(new int[]{-2, -1, 1, 2},
        new Solution_735().asteroidCollision(new int[]{-2, -1, 1, 2}));
  }

  @Test
  public void test5_whenSolution1() {
    Assertions.assertArrayEquals(new int[]{-15, 25},
        new Solution_735().asteroidCollision(new int[]{5, 10, -15, 25}));
  }

}