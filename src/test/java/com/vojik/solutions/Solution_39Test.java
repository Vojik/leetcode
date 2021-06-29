package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_39Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        List.of(List.of(2, 2, 3), List.of(7)),
        new Solution_39().combinationSum(new int[] {2, 3, 6, 7}, 7));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)),
        new Solution_39().combinationSum(new int[] {2, 3, 5}, 8));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(List.of(), new Solution_39().combinationSum(new int[] {2}, 1));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(List.of(List.of(1)), new Solution_39().combinationSum(new int[] {1}, 1));
  }

  @Test
  public void test5_whenSolution1() {
    assertEquals(List.of(List.of(1, 1)), new Solution_39().combinationSum(new int[] {1}, 2));
  }
}
