package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_638Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(14, new Solution_638().shoppingOffers(List.of(2, 5),
        List.of(List.of(3, 0, 5), List.of(1, 2, 10)), List.of(3, 2)));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(11, new Solution_638().shoppingOffers(List.of(2, 3, 4),
        List.of(List.of(1, 1, 0, 4), List.of(2, 2, 1, 9)), List.of(1, 2, 1)));
  }

}