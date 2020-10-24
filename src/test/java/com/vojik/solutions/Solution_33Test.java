package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_33Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_33 solution = new Solution_33();
    int[] input = new int[]{4, 5, 6, 7, 0, 1, 2};

    // when
    int actual = solution.search2(input, 3);

    // then
    assertEquals(-1, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_33 solution = new Solution_33();
    int actual = solution.search2(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
    assertEquals(4, actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_33 solution = new Solution_33();
    int actual = solution.search2(new int[]{1}, 0);
    assertEquals(-1, actual);
  }


  @Test
  public void test1_whenSolution2() {
    // given
    Solution_33 solution = new Solution_33();
    int[] input = new int[]{4, 5, 6, 7, 0, 1, 2};

    // when
    int actual = solution.search(input, 3);

    // then
    assertEquals(-1, actual);
  }

  @Test
  public void test2_whenSolution2() {
    Solution_33 solution = new Solution_33();
    int actual = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
    assertEquals(4, actual);
  }

  @Test
  public void test3_whenSolution2() {
    Solution_33 solution = new Solution_33();
    int actual = solution.search(new int[]{1}, 0);
    assertEquals(-1, actual);
  }

  @Test
  public void test4_whenSolution2() {
    Solution_33 solution = new Solution_33();
    int actual = solution.search(new int[]{1, 3}, 0);
    assertEquals(-1, actual);
  }

  @Test
  public void test5_whenSolution2() {
    Solution_33 solution = new Solution_33();
    int actual = solution.search(new int[]{8,1,2,3,4,5,6,7}, 6);
    assertEquals(6, actual);
  }

}