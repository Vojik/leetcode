package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_677Test {

  @Test
  public void test1_solution1() {
    Solution_677 mapSum = new Solution_677();
    mapSum.insert("apple", 3);
    assertEquals(3, mapSum.sum("ap"));
    mapSum.insert("app", 2);
    assertEquals(5, mapSum.sum("ap"));
  }

}