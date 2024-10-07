package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_2696Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(2, new Solution_2696().minLength("ABFCACDB"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(5, new Solution_2696().minLength("ACBBD"));
  }

}