package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_1768Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("apbqcr", new Solution_1768().mergeAlternately("abc", "pqr"));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("apbqrs", new Solution_1768().mergeAlternately("ab", "pqrs"));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("apbqcd", new Solution_1768().mergeAlternately("abcd", "pq"));
  }
  
}