package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_2491Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(22, new Solution_2491().dividePlayers(new int[]{3, 2, 5, 1, 3, 4}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(12, new Solution_2491().dividePlayers(new int[]{3, 4}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(-1, new Solution_2491().dividePlayers(new int[]{1, 1, 2, 3}));
  }

  @Test
  public void test1_whenSolution2() {
    assertEquals(22, new Solution_2491().dividePlayers2(new int[]{3, 2, 5, 1, 3, 4}));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(12, new Solution_2491().dividePlayers2(new int[]{3, 4}));
  }

  @Test
  public void test3_whenSolution2() {
    assertEquals(-1, new Solution_2491().dividePlayers2(new int[]{1, 1, 2, 3}));
  }
}