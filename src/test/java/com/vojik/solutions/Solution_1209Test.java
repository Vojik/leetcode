package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1209Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("abcd", new Solution_1209().removeDuplicates("abcd", 2));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals("aa", new Solution_1209().removeDuplicates("deeedbbcccbdaa", 3));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals("ps", new Solution_1209().removeDuplicates("pbbcggttciiippooaais", 2));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals("deddaa", new Solution_1209().removeDuplicates("deeeeeeeeeedbbcccbdaa", 3));
  }
}