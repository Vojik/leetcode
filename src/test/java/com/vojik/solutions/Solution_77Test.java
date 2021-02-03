package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_77Test {

  @Test
  public void test1_whenSolution1() {
    List<List<Integer>> expected = List
        .of(List.of(), List.of(2, 4), List.of(3, 4), List.of(2, 3), List.of(1, 3), List.of(1, 2),
            List.of(1, 4));
    assertEquals(expected, new Solution_77().combine(4, 2));
  }

}