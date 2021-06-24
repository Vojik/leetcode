package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1002Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        List.of("e", "l", "l"),
        new Solution_1002().commonChars(new String[] {"bella", "label", "roller"}));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        List.of("c", "o"),
        new Solution_1002().commonChars(new String[] {"cool", "lock", "cook"}));
  }
}