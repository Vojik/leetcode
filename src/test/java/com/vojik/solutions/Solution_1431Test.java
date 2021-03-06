package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_1431Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(List.of(true, true, true, false, true),
        new Solution_1431().kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(List.of(true, false, false, false, false),
        new Solution_1431().kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(List.of(true, false, true),
        new Solution_1431().kidsWithCandies(new int[]{12, 1, 12}, 10));
  }
}