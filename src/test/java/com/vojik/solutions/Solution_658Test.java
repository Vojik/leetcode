package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_658Test {

  @Test
  public void test1_whenSolution() {
    // given
    Solution_658 solution = new Solution_658();

    // when
    List<Integer> actual = solution.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3);

    // then
    assertArrayEquals(List.of(1, 2, 3, 4).toArray(), actual.toArray());
  }

  @Test
  public void test2_whenSolution() {
    Solution_658 solution = new Solution_658();
    List<Integer> actual = solution.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1);
    assertArrayEquals(List.of(1, 2, 3, 4).toArray(), actual.toArray());
  }

  @Test
  public void test3_whenSolution() {
    Solution_658 solution = new Solution_658();
    List<Integer> actual = solution
        .findClosestElements(new int[]{1, 2, 4, 4, 4, 4, 4, 5, 5, 5, 5}, 4, 5);
    assertArrayEquals(List.of(5, 5, 5, 5).toArray(), actual.toArray());
  }

  @Test
  public void test4_whenSolution() {
    Solution_658 solution = new Solution_658();
    List<Integer> actual = solution
        .findClosestElements(new int[]{1, 2, 4, 4, 4, 4, 4, 5, 5, 5, 5}, 5, 5);
    assertArrayEquals(List.of(4, 5, 5, 5, 5).toArray(), actual.toArray());
  }
}