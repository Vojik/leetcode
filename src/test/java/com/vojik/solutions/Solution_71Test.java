package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_71Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("/c", new Solution_71().simplifyPath("/a/./b/../../c/"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("/home/foo", new Solution_71().simplifyPath("/home//foo/"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("/", new Solution_71().simplifyPath("/../"));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals("/home", new Solution_71().simplifyPath("/home/"));
  }

}