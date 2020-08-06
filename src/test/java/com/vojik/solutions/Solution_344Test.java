package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_344Test {

  @Test
  public void test1_whenSolution1() {
    char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
    char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
    Solution_344.reverseString(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  public void test2_whenSolution1() {
    char[] input = new char[]{};
    char[] expected = new char[]{};
    Solution_344.reverseString(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  public void test3_whenSolution1() {
    char[] input = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
    char[] expected = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
    Solution_344.reverseString(input);
    Assertions.assertArrayEquals(expected, input);
  }

}