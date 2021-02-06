package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_151Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals("blue is sky the", new Solution_151().reverseWords("the sky is blue"));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals("world hello", new Solution_151().reverseWords("  hello world  "));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals("example good a", new Solution_151().reverseWords("a good   example"));
  }

  @Test
  public void test4_whenSolution1() {
    Assertions.assertEquals("Alice Loves Bob",
        new Solution_151().reverseWords("  Bob    Loves  Alice   "));
  }

  @Test
  public void test5_whenSolution1() {
    Assertions.assertEquals("bob like even not does Alice",
        new Solution_151().reverseWords("Alice does not even like bob"));
  }
}