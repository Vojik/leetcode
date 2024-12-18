package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Solution_47Test {

  @Test
  public void test1_whenSolution1() {
    Set<List<Integer>> set = Set.of(List.of(1, 1, 2), List.of(2, 1, 1), List.of(1, 2, 1));
    var result = new Solution_47().permuteUnique(new int[]{1, 1, 2});

    assertEquals(set.size(), result.size());
    for (List<Integer> list : result) {
      assertTrue(set.contains(list));
    }
  }

  @Test
  public void test2_whenSolution1() {
    Set<List<Integer>> set = Set.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3),
        List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1));
    var result = new Solution_47().permuteUnique(new int[]{1, 2, 3});

    assertEquals(set.size(), result.size());
    for (List<Integer> list : result) {
      assertTrue(set.contains(list));
    }
  }

}