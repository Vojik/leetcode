package com.vojik.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

  @Test
  public void test1() {
    int[] input = new int[]{1, 2};
    int actual = BinarySearch.binarySearch(input, 2);
    assertEquals(1, actual);
  }

  @Test
  public void test2() {
    int[] input = new int[]{1, 2, 6, 55, 77, 434, 1092, 3423};
    int actual = BinarySearch.binarySearch(input, 3423);
    assertEquals(7, actual);
  }

  @Test
  public void test3() {
    int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int actual = BinarySearch.binarySearch(input, 2);
    assertEquals(1, actual);
  }

  @Test
  public void test4() {
    int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int actual = BinarySearch.binarySearch2(input, 10);
    assertEquals(1, actual);
  }


  @Test
  public void test1_solution2() {
    int[] input = new int[]{1, 2};
    int actual = BinarySearch.binarySearch2(input, 2);
    assertEquals(1, actual);
  }

  @Test
  public void test2_solution2() {
    int[] input = new int[]{1, 2, 6, 55, 77, 434, 1092, 3423};
    int actual = BinarySearch.binarySearch2(input, 3423);
    assertEquals(7, actual);
  }

  @Test
  public void test3_solution2() {
    int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int actual = BinarySearch.binarySearch2(input, 2);
    assertEquals(1, actual);
  }

  @Test
  public void test4_solution2() {
    int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int actual = BinarySearch.binarySearch2(input, 10);
    assertEquals(9, actual);
  }

  @Test
  public void test5_solution2() {
    int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int actual = BinarySearch.binarySearch2(input, 9);
    assertEquals(8, actual);
  }

}