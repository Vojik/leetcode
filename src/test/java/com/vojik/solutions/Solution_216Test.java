package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_216Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(List.of(List.of(1, 2, 4)), new Solution_216().combinationSum3(3, 7));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(
        List.of(List.of(1, 2, 6), List.of(1, 3, 5), List.of(2, 3, 4)),
        new Solution_216().combinationSum3(3, 9));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(List.of(), new Solution_216().combinationSum3(4, 1));
  }

  @Test
  public void test4_whenSolution1() {
    assertEquals(List.of(), new Solution_216().combinationSum3(3, 2));
  }

  @Test
  public void test5_whenSolution1() {
    assertEquals(
        List.of(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)), new Solution_216().combinationSum3(9, 45));
  }
}
