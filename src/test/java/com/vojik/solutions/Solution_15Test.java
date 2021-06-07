package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_15Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)),
        new Solution_15().threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(List.of(), new Solution_15().threeSum(new int[] {}));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(List.of(), new Solution_15().threeSum(new int[] {0}));
  }
}
