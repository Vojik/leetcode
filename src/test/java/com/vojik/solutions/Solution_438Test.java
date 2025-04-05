package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_438Test {

  @Test
  public void test1_whenSolution() {
    assertEquals(List.of(0, 6),
        new Solution_438().findAnagrams("cbaebabacd", "abc"));
    assertEquals(List.of(0, 1, 2),
        new Solution_438().findAnagrams("abab", "ab"));
  }

}