package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_448Test {

  @Test
  public void test1_whenSolution1() {
    Solution_448 solution = new Solution_448();
    List<Integer> actual = solution.findDisappearedNumbers1(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    assertEquals(List.of(5, 6), actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_448 solution = new Solution_448();
    List<Integer> actual = solution.findDisappearedNumbers1(new int[]{1, 1});
    assertEquals(List.of(2), actual);
  }

  @Test
  public void test1_whenSolution2() {
    Solution_448 solution = new Solution_448();
    List<Integer> actual = solution.findDisappearedNumbers2(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    assertEquals(List.of(5, 6), actual);
  }

  @Test
  public void test2_whenSolution2() {
    Solution_448 solution = new Solution_448();
    List<Integer> actual = solution.findDisappearedNumbers2(new int[]{1, 1});
    assertEquals(List.of(2), actual);
  }

  @Test
  public void test3_whenSolution2() {
    Solution_448 solution = new Solution_448();
    List<Integer> actual = solution.findDisappearedNumbers2(new int[]{1, 1, 2, 2});
    assertEquals(List.of(3, 4), actual);
  }
}