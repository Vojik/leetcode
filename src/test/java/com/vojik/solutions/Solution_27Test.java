package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Solution_27Test {

  @Test
  public void test1_whenSolution1() {
    // given
    Solution_27 solution = new Solution_27();
    int[] input = new int[]{3, 2, 2, 3};

    // when
    int actual = solution.removeElement(input, 3);

    // then
    assertEquals(2, actual);
    assertArrayEquals(new int[]{2, 2}, Arrays.copyOfRange(input, 0, input.length - actual));
  }

  @Test
  public void test2_whenSolution1() {
    // given
    Solution_27 solution = new Solution_27();
    int[] input = new int[]{0, 1, 2, 2, 3, 0, 4, 2};

    // when
    int actual = solution.removeElement(input, 2);

    // then
    assertEquals(5, actual);
    assertArrayEquals(new int[]{0, 1, 4, 0, 3},
        Arrays.copyOfRange(input, 0, input.length - (input.length - actual)));
  }

  @Test
  public void test3_whenSolution1() {
    // given
    Solution_27 solution = new Solution_27();
    int[] input = new int[]{3};

    // when
    int actual = solution.removeElement(input, 2);

    // then
    assertEquals(1, actual);
    assertArrayEquals(new int[]{3}, input);
  }

  @Test
  public void test4_whenSolution1() {
    // given
    Solution_27 solution = new Solution_27();
    int[] input = new int[]{3};

    // when
    int actual = solution.removeElement(input, 3);

    // then
    assertEquals(0, actual);
  }
}