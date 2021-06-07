package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_763Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        List.of(9, 7, 8), new Solution_763().partitionLabels("ababcbacadefegdehijhklij"));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        List.of(1), new Solution_763().partitionLabels("a"));
  }
}
