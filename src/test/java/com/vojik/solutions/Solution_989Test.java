package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_989Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(List.of(1, 2, 3, 4),
        new Solution_989().addToArrayForm(new int[]{1, 2, 0, 0}, 34));
  }

}