package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_535Test {

  @Test
  public void test1_whenSolution1() {
    Solution_535 codec = new Solution_535();
    Assertions.assertEquals("https://leetcode.com/problems/design-tinyurl",
        codec.decode(codec.encode("https://leetcode.com/problems/design-tinyurl")));
  }


}