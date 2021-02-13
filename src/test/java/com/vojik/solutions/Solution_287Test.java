package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_287Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(6, new Solution_287().findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 6, 7}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(3, new Solution_287().findDuplicate(new int[]{3, 1, 3, 4, 2}));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(1, new Solution_287().findDuplicate(new int[]{1, 1}));
  }

  @Test
  public void test4_whenSolution1() {
    Assertions.assertEquals(1, new Solution_287().findDuplicate(new int[]{1, 1, 2}));
  }

  @Test
  public void test5_whenSolution1() {
    Assertions.assertEquals(1, new Solution_287().findDuplicate(new int[]{1, 1, 2, 3, 4, 5, 6, 7}));
  }

  @Test
  public void test6_whenSolution1() {
    Assertions.assertEquals(1, new Solution_287().findDuplicate(new int[]{2, 1, 1, 1, 4}));
  }

}