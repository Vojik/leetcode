package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_136Test {

  @Test
  public void test1_whenSolution1() {
    int actual = Solution_136.singleNumber(new int[]{2, 2, 1});
    Assertions.assertEquals(1, actual);
  }

  @Test
  public void test2_whenSolution1() {
    int actual = Solution_136.singleNumber(new int[]{4, 1, 2, 1, 2});
    Assertions.assertEquals(4, actual);
  }

  @Test
  public void test3_whenSolution1() {
    int actual = Solution_136.singleNumber(new int[]{-1});
    Assertions.assertEquals(-1, actual);
  }

  @Test
  public void test4_whenSolution1() {
    int actual = Solution_136.singleNumber(new int[]{4, 1, 2, 1, 2, 0, 0, 0, 0});
    Assertions.assertEquals(4, actual);
  }
}