package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1926Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(1, new Solution_1926().nearestExit(
        new char[][] {{'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}},
        new int[] {1, 2}));

    assertEquals(2, new Solution_1926().nearestExit(
        new char[][] {{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}},
        new int[] {1, 0}));

    assertEquals(-1, new Solution_1926().nearestExit(
        new char[][] {{'.', '+'}},
        new int[] {0, 0}));

    assertEquals(12, new Solution_1926().nearestExit(
        new char[][] {
            {'+', '.', '+', '+', '+', '+', '+'},
            {'+', '.', '+', '.', '.', '.', '+'},
            {'+', '.', '+', '.', '+', '.', '+'},
            {'+', '.', '.', '.', '+', '.', '+'},
            {'+', '+', '+', '+', '+', '.', '+'}},
        new int[] {0, 1}));

    assertEquals(7, new Solution_1926().nearestExit(
        new char[][] {
            {'+', '.', '+', '+', '+', '+', '+'},
            {'+', '.', '+', '.', '.', '.', '+'},
            {'+', '.', '+', '.', '+', '.', '+'},
            {'+', '.', '.', '.', '.', '.', '+'},
            {'+', '+', '+', '+', '.', '+', '.'}},
        new int[] {0, 1}));
  }

}