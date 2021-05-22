package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_340Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(3, new Solution_340().lengthOfLongestSubstringKDistinct("eceba", 2));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(2, new Solution_340().lengthOfLongestSubstringKDistinct("aa", 1));
  }
}
