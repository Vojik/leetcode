package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1730Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(3, new Solution_1730().getFood(
        new char[][] {
            {'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', '*', 'O', 'O', 'O', 'X'},
            {'X', 'O', 'O', '#', 'O', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X'}
        })
    );
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(-1, new Solution_1730().getFood(
        new char[][] {
            {'X', 'X', 'X', 'X', 'X'},
            {'X', '*', 'X', 'O', 'X'},
            {'X', 'O', 'X', '#', 'X'},
            {'X', 'X', 'X', 'X', 'X'}
        })
    );
  }


}