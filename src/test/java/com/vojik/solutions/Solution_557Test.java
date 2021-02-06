package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution_557Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals("s'teL ekat edoCteeL tsetnoc",
        new Solution_557().reverseWords("Let's take LeetCode contest"));
  }

}