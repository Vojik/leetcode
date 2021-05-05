package com.vojik.solutions;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_443Test {

  @Test
  public void test1_whenSolution1() {
    char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    int actual = new Solution_443().compress(input);
    Assertions.assertEquals(6, actual);
    Assertions.assertArrayEquals(
        new char[] {'a', '2', 'b', '2', 'c', '3'}, Arrays.copyOf(input, actual));
  }

  @Test
  public void test2_whenSolution1() {
    char[] input = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    int actual = new Solution_443().compress(input);
    Assertions.assertEquals(4, actual);
    Assertions.assertArrayEquals(new char[] {'a', 'b', '1', '2'}, Arrays.copyOf(input, actual));
  }
}
