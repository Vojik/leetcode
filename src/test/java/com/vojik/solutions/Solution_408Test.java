package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution_408Test {

  @Test
  public void test1_whenSolution1() {
    assertTrue(new Solution_408().validWordAbbreviation("internationalization", "i12iz4n"));
  }

  @Test
  public void test1_whenSolution2() {
    assertFalse(new Solution_408().validWordAbbreviation("apple", "a2e"));
  }

  @Test
  public void test1_whenSolution3() {
    assertTrue(new Solution_408().validWordAbbreviation("internationalization", "i5a11o1"));
  }

  @Test
  public void test1_whenSolution4() {
    assertFalse(new Solution_408().validWordAbbreviation("a", "2"));
  }

  @Test
  public void test1_whenSolution5() {
    assertFalse(new Solution_408().validWordAbbreviation("hi", "hi2"));
  }


}