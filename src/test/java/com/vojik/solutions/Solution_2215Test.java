package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_2215Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(List.of(List.of(1, 3), List.of(4, 6)),
        new Solution_2215().findDifference(new int[] {1, 2, 3}, new int[] {2, 4, 6}));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(List.of(List.of(3), List.of()),
        new Solution_2215().findDifference(new int[] {1, 2, 3, 3}, new int[] {1, 1, 2, 2}));
  }

}