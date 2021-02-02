package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_90Test {

  @Test
  public void test1_whenSolution1() {
    List<List<Integer>> expected = List
        .of(List.of(), List.of(1), List.of(1, 2), List.of(1, 2, 3), List.of(1, 3), List.of(2),
            List.of(2, 3), List.of(3));
    assertEquals(expected, new Solution_90().subsetsWithDup(new int[]{1, 2, 3}));
  }


  @Test
  public void test2_whenSolution1() {
    List<List<Integer>> expected = List
        .of(List.of(), List.of(1));
    assertEquals(expected, new Solution_90().subsetsWithDup(new int[]{1}));
  }
}