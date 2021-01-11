package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_119Test {

  @Test
  public void test1_whenSolution1() {
    List<Integer> actual = new Solution_119().getRow(3);
    Assertions.assertEquals(List.of(1, 3, 3, 1), actual);
  }

  @Test
  public void test2_whenSolution1() {
    List<Integer> actual = new Solution_119().getRow(1);
    Assertions.assertEquals(List.of(1, 1), actual);
  }

  @Test
  public void test3_whenSolution1() {
    List<Integer> actual = new Solution_119().getRow(0);
    Assertions.assertEquals(List.of(1), actual);
  }

  @Test
  public void test4_whenSolution1() {
    List<Integer> actual = new Solution_119().getRow(30);
    Assertions.assertEquals(
        List.of(1, 30, 435, 4060, 27405, 142506, 593775, 2035800, 5852925, 14307150, 30045015,
            54627300, 86493225, 119759850, 145422675, 155117520, 145422675, 119759850, 86493225,
            54627300, 30045015, 14307150, 5852925, 2035800, 593775, 142506, 27405, 4060, 435, 30,
            1), actual);
  }


}