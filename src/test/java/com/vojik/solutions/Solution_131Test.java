package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_131Test {

  @Test
  public void test1_whenSolution1() {
    List<List<String>> expected = new ArrayList<>();
    expected.add(List.of("a", "a", "b"));
    expected.add(List.of("aa", "b"));
    assertEquals(expected, new Solution_131().partition("aab"));
  }

  @Test
  public void test2_whenSolution1() {
    List<List<String>> expected = new ArrayList<>();
    expected.add(List.of("a"));
    assertEquals(expected, new Solution_131().partition("a"));
  }
}