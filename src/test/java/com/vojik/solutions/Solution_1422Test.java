package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1422Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(5, new Solution_1422().maxScore("011101"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(5, new Solution_1422().maxScore("00111"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(3, new Solution_1422().maxScore("1111"));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(1, new Solution_1422().maxScore("00"));
  }

  @Test
  public void test1_whenSolution2() {
    assertEquals(5, new Solution_1422().maxScore2("011101"));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(5, new Solution_1422().maxScore2("00111"));
  }

  @Test
  public void test3_whenSolution2() {
    assertEquals(3, new Solution_1422().maxScore2("1111"));
  }

  @Test
  public void test4_whenSolution2() {
    assertEquals(1, new Solution_1422().maxScore2("00"));
  }

}