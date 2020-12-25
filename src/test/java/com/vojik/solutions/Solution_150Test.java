package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_150Test {

  @Test
  public void test1_whenSolution1() {
    Solution_150 solution = new Solution_150();
    int actual = solution.evalRPN(new String[]{"3", "11", "+", "5", "-"});
    Assertions.assertEquals(9, actual);
  }

  @Test
  public void test2_whenSolution1() {
    Solution_150 solution = new Solution_150();
    int actual = solution.evalRPN(new String[]{"2", "1", "+", "3", "*"});
    Assertions.assertEquals(9, actual);
  }

  @Test
  public void test3_whenSolution1() {
    Solution_150 solution = new Solution_150();
    int actual = solution.evalRPN(new String[]{"4", "13", "5", "/", "+"});
    Assertions.assertEquals(6, actual);
  }

  @Test
  public void test4_whenSolution1() {
    Solution_150 solution = new Solution_150();
    int actual = solution
        .evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
    Assertions.assertEquals(22, actual);
  }

  @Test
  public void test5_whenSolution1() {
    Solution_150 solution = new Solution_150();
    int actual = solution
        .evalRPN(new String[]{"4", "3", "-"});
    Assertions.assertEquals(1, actual);
  }

  @Test
  public void test6_whenSolution1() {
    Solution_150 solution = new Solution_150();
    int actual = solution.evalRPN(new String[]{"3", "11", "-", "5", "-"});
    Assertions.assertEquals(-13, actual);
  }

  @Test
  public void test7_whenSolution1() {
    Solution_150 solution = new Solution_150();
    int actual = solution.evalRPN(new String[] {"9", "3", "/"});
    Assertions.assertEquals(3, actual);
  }

  ///////////////////////////////////////////////////

  @Test
  public void test1_whenSolution2() {
    Solution_150 solution = new Solution_150();
    int actual = solution.evalRPN2(new String[]{"3", "11", "+", "5", "-"});
    Assertions.assertEquals(9, actual);
  }

  @Test
  public void test2_whenSolution2() {
    Solution_150 solution = new Solution_150();
    int actual = solution.evalRPN2(new String[]{"2", "1", "+", "3", "*"});
    Assertions.assertEquals(9, actual);
  }

  @Test
  public void test3_whenSolution2() {
    Solution_150 solution = new Solution_150();
    int actual = solution.evalRPN2(new String[]{"4", "13", "5", "/", "+"});
    Assertions.assertEquals(6, actual);
  }

  @Test
  public void test4_whenSolution2() {
    Solution_150 solution = new Solution_150();
    int actual = solution
        .evalRPN2(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
    Assertions.assertEquals(22, actual);
  }

  @Test
  public void test5_whenSolution2() {
    Solution_150 solution = new Solution_150();
    int actual = solution
        .evalRPN2(new String[]{"4", "3", "-"});
    Assertions.assertEquals(1, actual);
  }

  @Test
  public void test6_whenSolution2() {
    Solution_150 solution = new Solution_150();
    int actual = solution.evalRPN2(new String[]{"3", "11", "-", "5", "-"});
    Assertions.assertEquals(-13, actual);
  }

  @Test
  public void test7_whenSolution2() {
    Solution_150 solution = new Solution_150();
    int actual = solution.evalRPN2(new String[]{"9", "3", "/"});
    Assertions.assertEquals(3, actual);
  }

}