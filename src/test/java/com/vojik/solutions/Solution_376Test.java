package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_376Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(1, new Solution_376().wiggleMaxLength(new int[]{0, 0, 0, 0, 0}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(1, new Solution_376().wiggleMaxLength(new int[]{1,1,1,1,1}));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(6, new Solution_376().wiggleMaxLength(new int[]{1,7,4,9,2,5}));
  }

  @Test
  public void test4_whenSolution1() {
    Assertions.assertEquals(7, new Solution_376().wiggleMaxLength(new int[]{1,17,5,10,13,15,10,5,16,8}));
  }

  @Test
  public void test5_whenSolution1() {
    Assertions.assertEquals(2, new Solution_376().wiggleMaxLength(new int[]{1,2,3,4,5,6,7,8,9}));
  }
}