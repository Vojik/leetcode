package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Solution_26Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_26 solution = new Solution_26();
    int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    // when
    int actual = solution.removeDuplicates(input);

    // then
    assertEquals(5, actual);
    assertArrayEquals(new int[]{0, 1, 2, 3, 4},
        Arrays.copyOfRange(input, 0, input.length - (input.length - actual)));
  }

  @Test
  public void test2_whenSolution1() {
    // given
    Solution_26 solution = new Solution_26();
    int[] input = new int[]{1, 1, 2};

    // when
    int actual = solution.removeDuplicates(input);

    // then
    assertEquals(2, actual);
    assertArrayEquals(new int[]{1, 2},
        Arrays.copyOfRange(input, 0, input.length - (input.length - actual)));
  }

  @Test
  public void test3_whenSolution1() {
    // given
    Solution_26 solution = new Solution_26();
    int[] input = new int[]{1};

    // when
    int actual = solution.removeDuplicates(input);

    // then
    assertEquals(1, actual);
    assertArrayEquals(new int[]{1},
        Arrays.copyOfRange(input, 0, input.length - (input.length - actual)));
  }


  @Test
  public void test1_whenSolution2() {
    // given
    Solution_26 solution = new Solution_26();
    int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    // when
    int actual = solution.removeDuplicates2(input);

    // then
    assertEquals(5, actual);
    assertArrayEquals(new int[]{0, 1, 2, 3, 4},
        Arrays.copyOfRange(input, 0, input.length - (input.length - actual)));
  }

  @Test
  public void test2_whenSolution2() {
    // given
    Solution_26 solution = new Solution_26();
    int[] input = new int[]{1, 1, 2};

    // when
    int actual = solution.removeDuplicates2(input);

    // then
    assertEquals(2, actual);
    assertArrayEquals(new int[]{1, 2},
        Arrays.copyOfRange(input, 0, input.length - (input.length - actual)));
  }

  @Test
  public void test3_whenSolution2() {
    // given
    Solution_26 solution = new Solution_26();
    int[] input = new int[]{1};

    // when
    int actual = solution.removeDuplicates2(input);

    // then
    assertEquals(1, actual);
    assertArrayEquals(new int[]{1},
        Arrays.copyOfRange(input, 0, input.length - (input.length - actual)));
  }

}