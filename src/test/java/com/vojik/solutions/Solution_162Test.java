package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Solution_162Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_162 solution = new Solution_162();
    int[] input = new int[]{1, 2, 3, 1};

    // when
    int actual = solution.findPeakElement(input);

    // then
    assertEquals(2, actual);
  }

  @Test
  public void test2_whenSolution1() {
    // given
    Solution_162 solution = new Solution_162();
    int[] input = new int[]{1, 2, 1, 3, 5, 6, 4};

    // when
    int actual = solution.findPeakElement(input);

    // then
    assertTrue(Arrays.asList(1, 5).contains(actual));
  }

  @Test
  public void test3_whenSolution1() {
    // given
    Solution_162 solution = new Solution_162();
    int[] input = new int[]{1, 2, 3, 2, 3, 4, 3, 2};

    // when
    int actual = solution.findPeakElement(input);

    // then
    assertTrue(Arrays.asList(2, 5).contains(actual));
  }

  @Test
  public void test1_whenSolution2() {
    // given
    Solution_162 solution = new Solution_162();
    int[] input = new int[]{1, 2, 3, 1};

    // when
    int actual = solution.findPeakElement2(input);

    // then
    assertEquals(2, actual);
  }

  @Test
  public void test2_whenSolution2() {
    // given
    Solution_162 solution = new Solution_162();
    int[] input = new int[]{1, 2, 1, 3, 5, 6, 4};

    // when
    int actual = solution.findPeakElement2(input);

    // then
    assertTrue(Arrays.asList(1, 5).contains(actual));
  }

  @Test
  public void test3_whenSolution2() {
    // given
    Solution_162 solution = new Solution_162();
    int[] input = new int[]{1, 2, 3, 2, 3, 4, 3, 2};

    // when
    int actual = solution.findPeakElement2(input);

    // then
    assertTrue(Arrays.asList(2, 5).contains(actual));
  }

  @Test
  public void test1_whenSolution3() {
    int actual = new Solution_162().findPeakElement3(new int[]{1, 2, 3, 1});
    assertEquals(2, actual);
  }

  @Test
  public void test2_whenSolution3() {
    int actual = new Solution_162().findPeakElement3(new int[]{1, 2, 1, 3, 5, 6, 4});
    assertTrue(Arrays.asList(1, 5).contains(actual));
  }

  @Test
  public void test3_whenSolution3() {
    int actual = new Solution_162().findPeakElement3(new int[]{1, 2, 3, 2, 3, 4, 3, 2});
    assertTrue(Arrays.asList(2, 5).contains(actual));
  }

  @Test
  public void test3_whenSolution4() {
    int actual = new Solution_162().findPeakElement3(new int[]{1});
    assertEquals(0, actual);
  }
}