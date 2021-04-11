package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1239Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(4,
        new Solution_1239().maxLength(List.of("un", "iq", "ue")));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(6,
        new Solution_1239().maxLength(List.of("cha","r","act","ers")));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(26,
        new Solution_1239().maxLength(List.of("abcdefghijklmnopqrstuvwxyz")));
  }

}