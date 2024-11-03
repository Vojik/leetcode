package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_796Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_796().rotateString("abcde", "cdeab"));
  }

  @Test
  public void test2_whenSolution1() {
    assertFalse(new Solution_796().rotateString("abcde", "abced"));
  }

  //////////

  @Test
  public void test1_whenSolution2() {
    assertTrue(new Solution_796().rotateString2("abcde", "cdeab"));
  }

  @Test
  public void test2_whenSolution2() {
    assertFalse(new Solution_796().rotateString2("abcde", "abced"));
  }


}