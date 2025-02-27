package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_1668Test {

  @Test
  public void testsForSolution1() {
    assertEquals(2, new Solution_1668().maxRepeating("ababc", "ab"));
    assertEquals(1, new Solution_1668().maxRepeating("ababc", "ba"));
    assertEquals(0, new Solution_1668().maxRepeating("ababc", "ac"));
    assertEquals(5,
        new Solution_1668().maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
  }

  @Test
  public void testsForSolution2() {
    assertEquals(2, new Solution_1668().maxRepeating2("ababc", "ab"));
    assertEquals(1, new Solution_1668().maxRepeating2("ababc", "ba"));
    assertEquals(0, new Solution_1668().maxRepeating2("ababc", "ac"));
    assertEquals(5,
        new Solution_1668().maxRepeating2("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
  }

}