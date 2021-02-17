package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_784Test {

  @Test
  public void test1_whenSolution1() {
    List<String> actual = new Solution_784().letterCasePermutation("a1b2");
    List<String> expected = List.of("a1b2", "a1B2", "A1b2", "A1B2");
    assertTrue(actual.size() == expected.size() && actual.containsAll(expected) && expected
        .containsAll(actual));
  }

}