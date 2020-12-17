package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_752Test {

  @Test
  public void test1_whenSolution1() {
    Solution_752 solution = new Solution_752();
    int actual = solution.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202");
    Assertions.assertEquals(6, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_752 solution = new Solution_752();
    int actual = solution.openLock(new String[]{"8888"}, "0009");
    Assertions.assertEquals(1, actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_752 solution = new Solution_752();
    int actual = solution.openLock(new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888");
    Assertions.assertEquals(-1, actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_752 solution = new Solution_752();
    int actual = solution.openLock(new String[]{"0000"}, "8888");
    Assertions.assertEquals(-1, actual);
  }

}