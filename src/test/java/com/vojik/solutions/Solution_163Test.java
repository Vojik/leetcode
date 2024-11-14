package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_163Test {

  @Test
  public void test1_whenSolution1() {
    List<List<Integer>> expected = List.of(List.of(0, 2), List.of(4, 49), List.of(51, 74),
        List.of(76, 99));
    Assertions.assertEquals(expected,
        new Solution_163().findMissingRanges(new int[]{3, 50, 75}, 0, 99));
  }

  @Test
  public void test2_whenSolution1() {
    List<List<Integer>> expected = List.of();
    Assertions.assertEquals(expected,
        new Solution_163().findMissingRanges(new int[]{-1}, -1, -1));
  }

  @Test
  public void test3_whenSolution1() {
    List<List<Integer>> expected = List.of(List.of(2, 2), List.of(4, 49), List.of(51, 74),
        List.of(76, 99));
    Assertions.assertEquals(expected,
        new Solution_163().findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99));
  }

  @Test
  public void test4_whenSolution1() {
    List<List<Integer>> expected = List.of(List.of(1, 1));
    Assertions.assertEquals(expected,
        new Solution_163().findMissingRanges(new int[]{}, 1, 1));
  }

}