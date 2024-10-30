package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1249Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals("()lee(t(c)o)de",
        new Solution_1249().minRemoveToMakeValid("()le)))))e(t(c)o)de)"));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals("", new Solution_1249().minRemoveToMakeValid("))))))((((((("));
  }

  @Test
  public void test1_whenSolution2() {
    Assertions.assertEquals("()lee(t(c)o)de",
        new Solution_1249().minRemoveToMakeValid2("()le)))))e(t(c)o)de)"));
  }

  @Test
  public void test2_whenSolution2() {
    Assertions.assertEquals("", new Solution_1249().minRemoveToMakeValid2("))))))((((((("));
  }
}