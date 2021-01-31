package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution_1641Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(15, new Solution_1641().countVowelStringsBacktracking(2));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(5, new Solution_1641().countVowelStringsBacktracking(1));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(316251, new Solution_1641().countVowelStringsBacktracking(50));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(35, new Solution_1641().countVowelStringsBacktracking(3));
  }


  /////

  @Test
  public void test1_whenSolution2() {
    assertEquals(15, new Solution_1641().countVowelStringsBacktracking(2));
  }

  @Test
  public void test2_whenSolution2() {
    assertEquals(5, new Solution_1641().countVowelStringsBacktracking(1));
  }

  @Test
  public void test3_whenSolution2() {
    assertEquals(316251, new Solution_1641().countVowelStringsBacktracking(50));
  }

  @Test
  public void test4_whenSolution2() {
    assertEquals(35, new Solution_1641().countVowelStringsBacktracking(3));
  }

}