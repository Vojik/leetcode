package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_118Test {

  @Test
  public void test1_whenSolution1() {
    List<List<Integer>> actual = new Solution_118().generate(3);
    List<List<Integer>> expected = List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1));
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void test2_whenSolution1() {
    List<List<Integer>> actual = new Solution_118().generate(5);
    List<List<Integer>> expected = List
        .of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.
            of(1, 4, 6, 4, 1));
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void test3_whenSolution1() {
    List<List<Integer>> actual = new Solution_118().generate(1);
    Assertions.assertEquals(List.of(List.of(1)), actual);
  }

  @Test
  public void test4_whenSolution1() {
    List<List<Integer>> actual = new Solution_118().generate(0);
    Assertions.assertEquals(List.of(), actual);
  }

}