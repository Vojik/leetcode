package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_647Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(3, new Solution_647().countSubstrings("abc"));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(6, new Solution_647().countSubstrings("aaa"));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(21, new Solution_647().countSubstrings("aaaaaa"));
  }

}