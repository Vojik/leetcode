package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_820Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(10, new Solution_820().minimumLengthEncoding(new String[]{"time", "me", "bell"}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(2, new Solution_820().minimumLengthEncoding(new String[]{"t"}));
  }

  ////////////////////////

  @Test
  public void test1_whenSolution2() {
    assertEquals(10, new Solution_820().minimumLengthEncoding(new String[]{"time", "me", "bell"}));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(2, new Solution_820().minimumLengthEncoding(new String[]{"t"}));
  }
}