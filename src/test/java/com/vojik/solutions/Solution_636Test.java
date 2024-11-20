package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_636Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertArrayEquals(
        new int[]{3, 4}, new Solution_636().exclusiveTime(2,
            List.of("0:start:0", "1:start:2", "1:end:5", "0:end:6")));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertArrayEquals(
        new int[]{8}, new Solution_636().exclusiveTime(1,
            List.of("0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7")));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertArrayEquals(
        new int[]{7, 1}, new Solution_636().exclusiveTime(2,
            List.of("0:start:0", "0:start:2", "0:end:5", "1:start:6", "1:end:6", "0:end:7")));
  }

}