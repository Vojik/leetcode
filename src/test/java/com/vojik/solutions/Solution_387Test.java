package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_387Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(0, new Solution_387().firstUniqChar("leetcode"));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(2, new Solution_387().firstUniqChar("loveleetcode"));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(-1, new Solution_387().firstUniqChar("baabaaab"));
  }

}