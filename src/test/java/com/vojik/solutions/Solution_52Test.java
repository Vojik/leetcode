package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_52Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_52().totalNQueens(4));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(10, new Solution_52().totalNQueens(5));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(352, new Solution_52().totalNQueens(9));
  }


  ////////////

  @Test
  public void test1_whenSolution2() {
    assertEquals(2, new Solution_52().totalNQueensOptimal(4));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(10, new Solution_52().totalNQueensOptimal(5));
  }

  @Test
  public void test3_whenSolution2() {
    assertEquals(352, new Solution_52().totalNQueensOptimal(9));
  }

}