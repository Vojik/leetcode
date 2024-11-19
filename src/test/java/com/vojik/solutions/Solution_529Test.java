package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_529Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new char[][]{{'B', '1', 'E', '1', 'B'}, {'B', '1', 'M', '1', 'B'},
            {'B', '1', '1', '1', 'B'}, {'B', 'B', 'B', 'B', 'B'}}
        , new Solution_529().updateBoard(
            new char[][]{{'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E'}}, new int[]{3, 0}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new char[][]{{'B', '1', 'E', '1', 'B'}, {'B', '1', 'X', '1', 'B'},
            {'B', '1', '1', '1', 'B'}, {'B', 'B', 'B', 'B', 'B'}}
        , new Solution_529().updateBoard(
            new char[][]{{'B', '1', 'E', '1', 'B'}, {'B', '1', 'M', '1', 'B'},
                {'B', '1', '1', '1', 'B'}, {'B', 'B', 'B', 'B', 'B'}}
            , new int[]{1, 2}));
  }

  @Test
  public void test3_whenSolution1() {
    assertArrayEquals(new char[][]{{'B', 'B', 'B', 'B', 'B', 'B', '1', '1'},
            {'B', '1', '1', '1', 'B', 'B', '1', 'M'}, {'1', '2', 'M', '1', 'B', 'B', '1', '1'},
            {'M', '2', '1', '1', 'B', 'B', 'B', 'B'}, {'1', '1', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'}, {'B', '1', '2', '2', '1', 'B', 'B', 'B'},
            {'B', '1', 'M', 'M', '1', 'B', 'B', 'B'}}
        , new Solution_529().updateBoard(
            new char[][]{{'B', 'B', 'B', 'B', 'B', 'B', '1', 'E'},
                {'B', '1', '1', '1', 'B', 'B', '1', 'M'}, {'1', '2', 'M', '1', 'B', 'B', '1', '1'},
                {'M', '2', '1', '1', 'B', 'B', 'B', 'B'}, {'1', '1', 'B', 'B', 'B', 'B', 'B', 'B'},
                {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'}, {'B', '1', '2', '2', '1', 'B', 'B', 'B'},
                {'B', '1', 'M', 'M', '1', 'B', 'B', 'B'}}
            , new int[]{0, 7}));
  }

}