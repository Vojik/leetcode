package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_394Test {

  @Test
  public void test1_whenSolution1() {
    Solution_394 solution = new Solution_394();
    Assertions.assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
  }

  @Test
  public void test2_whenSolution1() {
    Solution_394 solution = new Solution_394();
    Assertions.assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
  }

  @Test
  public void test3_whenSolution1() {
    Solution_394 solution = new Solution_394();
    Assertions.assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
  }

  @Test
  public void test4_whenSolution1() {
    Solution_394 solution = new Solution_394();
    Assertions.assertEquals("abccdcdcdxyz", solution.decodeString("abc3[cd]xyz"));
  }
}