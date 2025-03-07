package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_17Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
        new Solution_17().letterCombinations("23"));

    assertEquals(List.of(),
        new Solution_17().letterCombinations(""));

    assertEquals(List.of("a", "b", "c"),
        new Solution_17().letterCombinations("2"));
  }

}