package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_509Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(5, new Solution_509().fib(5));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(1, new Solution_509().fib(1));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(0, new Solution_509().fib(0));
  }

  @Test
  public void test4_whenSolution1() {
    Assertions.assertEquals(3, new Solution_509().fib(4));
  }

  @Test
  public void test5_whenSolution1() {
    Assertions.assertEquals(55, new Solution_509().fib(10));
  }
}