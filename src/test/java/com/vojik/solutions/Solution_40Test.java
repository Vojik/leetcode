package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_40Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(List.of(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6)),
        new Solution_40().combinationSum2(new int[] {10, 1, 2, 7, 6, 1, 5}, 8));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(List.of(List.of(1, 2, 2), List.of(5)),
        new Solution_40().combinationSum2(new int[] {2, 5, 2, 1, 2}, 5));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(List.of(List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)),
        new Solution_40().combinationSum2(
            new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 10));
  }

}