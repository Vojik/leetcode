package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_1957Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("leetcode", new Solution_1957().makeFancyString("leeetcode"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("aabaa", new Solution_1957().makeFancyString("aaabaaaa"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("aab", new Solution_1957().makeFancyString("aab"));
  }

}