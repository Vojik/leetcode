package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1688Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(6, new Solution_1688().numberOfMatchesBacktracking(7));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(0, new Solution_1688().numberOfMatchesBacktracking(1));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(13, new Solution_1688().numberOfMatchesBacktracking(14));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(199, new Solution_1688().numberOfMatchesBacktracking(200));
  }

  ////////

  @Test
  public void test1_whenSolution2() {
    assertEquals(6, new Solution_1688().numberOfMatchesFunny(7));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(0, new Solution_1688().numberOfMatchesFunny(1));
  }

  @Test
  public void test3_whenSolution2() {
    assertEquals(13, new Solution_1688().numberOfMatchesFunny(14));
  }

  @Test
  public void test4_whenSolution2() {
    assertEquals(199, new Solution_1688().numberOfMatchesFunny(200));
  }
}