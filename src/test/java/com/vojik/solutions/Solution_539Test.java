package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_539Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(1, new Solution_539().findMinDifference(List.of("23:59", "00:00")));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(0, new Solution_539().findMinDifference(List.of("00:00","23:59","00:00")));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(0, new Solution_539().findMinDifference(List.of("01:01","02:01","03:00")));
  }

}