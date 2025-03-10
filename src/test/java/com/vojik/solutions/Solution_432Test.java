package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_432Test {

  @Test
  public void test1_whenSolution1() {
    Solution_432 solution = new Solution_432();
    solution.inc("hello");
    solution.inc("hello");
    assertEquals("hello", solution.getMaxKey());
    assertEquals("hello", solution.getMinKey());
    solution.inc("leet");
    assertEquals("hello", solution.getMaxKey());
    assertEquals("leet", solution.getMinKey());
  }

  @Test
  public void test2_whenSolution1() {
    Solution_432 solution = new Solution_432();
    solution.inc("hello");
    solution.inc("goodbye");
    solution.inc("hello");
    solution.inc("hello");
    assertEquals("hello", solution.getMaxKey());
    solution.inc("leet");
    solution.inc("code");
    solution.inc("leet");
    solution.dec("hello");
    solution.inc("leet");
    solution.inc("code");
    solution.inc("code");
    assertEquals("code", solution.getMaxKey());
  }

  @Test
  public void test3_whenSolution1() {
    Solution_432 solution = new Solution_432();
    solution.inc("hello");
    solution.inc("world");
    solution.inc("leet");
    solution.inc("code");
    solution.inc("ds");
    solution.inc("leet");
    assertEquals("leet", solution.getMaxKey());
    solution.inc("ds");
    solution.dec("leet");
    assertEquals("ds", solution.getMaxKey());
    solution.dec("ds");
    solution.inc("hello");
    assertEquals("hello", solution.getMaxKey());
  }

  @Test
  public void test4_whenSolution1() {
    Solution_432 solution = new Solution_432();
    solution.inc("hello");
    solution.inc("world");
    solution.inc("leet");
    solution.inc("code");
    solution.inc("ds");
    solution.inc("leet");
    assertEquals("leet", solution.getMaxKey());
    solution.inc("ds");
    solution.dec("leet");
    assertEquals("ds", solution.getMaxKey());
    solution.dec("ds");
    solution.inc("hello");
    assertEquals("hello", solution.getMaxKey());
    solution.inc("hello");
    solution.inc("hello");
    solution.dec("world");
    solution.dec("leet");
    solution.dec("code");
    solution.dec("ds");
    assertEquals("hello", solution.getMaxKey()); // check
    solution.inc("new");
    solution.inc("new");
    solution.inc("new");
    solution.inc("new");
    solution.inc("new");
    solution.inc("new");
    assertEquals("new", solution.getMaxKey()); // check
    assertEquals("hello", solution.getMinKey()); // check
  }

  @Test
  public void test5_whenSolution1() {
    Solution_432 solution = new Solution_432();
    solution.inc("hello");
    solution.inc("hello");
    assertEquals("hello", solution.getMaxKey());
    assertEquals("hello", solution.getMinKey());
    solution.dec("hello");
    solution.dec("hello");
    assertEquals("", solution.getMaxKey());
    solution.inc("hello");
    assertEquals("hello", solution.getMinKey());
  }

}