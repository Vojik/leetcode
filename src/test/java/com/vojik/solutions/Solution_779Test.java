package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_779Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(0, new Solution_779().kthGrammar(1, 1));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(0, new Solution_779().kthGrammar(2, 1));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(1, new Solution_779().kthGrammar(2, 2));
  }

  @Test
  public void test4_whenSolution1() {
    Assertions.assertEquals(1, new Solution_779().kthGrammar(4, 5));
  }

  @Test
  public void test5_whenSolution1() {
    Assertions.assertEquals(0, new Solution_779().kthGrammar(5, 4));
  }

}