package com.vojik.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_152Test {

  @Test
  public void test1_whenSolution1() {
    int actual = Solution_152.solution1(new int[]{2, 3, -2, 4});
    Assertions.assertEquals(6, actual);
  }

  @Test
  public void test2_whenSolution1() {
    int actual = Solution_152.solution1(new int[]{-2, 0, -1});
    Assertions.assertEquals(0, actual);
  }

  @Test
  public void test3_whenSolution1() {
    int actual = Solution_152.solution1(null);
    Assertions.assertEquals(0, actual);
  }

  @Test
  public void test4_whenSolution1() {
    int actual = Solution_152.solution1(new int[]{});
    Assertions.assertEquals(0, actual);
  }

  @Test
  public void test5_whenSolution1() {
    int actual = Solution_152.solution1(new int[]{-2, -9, -1});
    Assertions.assertEquals(18, actual);
  }

  @Test
  public void test6_whenSolution1() {
    int actual = Solution_152.solution1(new int[]{-2});
    Assertions.assertEquals(-2, actual);
  }

  @Test
  public void test7_whenSolution1() {
    int actual = Solution_152.solution1(new int[]{-2, -9, 3, -5});
    Assertions.assertEquals(135, actual); // -9, 3, -5
  }


  //////////////////////////////////////

  @Test
  public void test1_whenSolution2() {
    int actual = Solution_152.solution2(new int[]{2, 3, -2, 4});
    Assertions.assertEquals(6, actual);
  }

  @Test
  public void test2_whenSolution2() {
    int actual = Solution_152.solution2(new int[]{-2, 0, -1});
    Assertions.assertEquals(0, actual);
  }

  @Test
  public void test3_whenSolution2() {
    int actual = Solution_152.solution2(null);
    Assertions.assertEquals(0, actual);
  }

  @Test
  public void test4_whenSolution2() {
    int actual = Solution_152.solution2(new int[]{});
    Assertions.assertEquals(0, actual);
  }

  @Test
  public void test5_whenSolution2() {
    int actual = Solution_152.solution2(new int[]{-2, -9, -1});
    Assertions.assertEquals(18, actual);
  }

  @Test
  public void test6_whenSolution2() {
    int actual = Solution_152.solution2(new int[]{-2});
    Assertions.assertEquals(-2, actual);
  }

  @Test
  public void test7_whenSolution2() {
    int actual = Solution_152.solution2(new int[]{-2, -9, 3, -5});
    Assertions.assertEquals(135, actual); // -9, 3, -5
  }
}