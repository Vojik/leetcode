package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_658Test {

  @Test
  public void test1_whenSolution() {
    List<Integer> actual = new Solution_658().findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3);
    assertArrayEquals(List.of(1, 2, 3, 4).toArray(), actual.toArray());
  }

  @Test
  public void test2_whenSolution() {
    List<Integer> actual = new Solution_658().findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1);
    assertArrayEquals(List.of(1, 2, 3, 4).toArray(), actual.toArray());
  }

  @Test
  public void test3_whenSolution() {
    List<Integer> actual = new Solution_658()
        .findClosestElements(new int[]{1, 2, 4, 4, 4, 4, 4, 5, 5, 5, 5}, 4, 5);
    assertArrayEquals(List.of(5, 5, 5, 5).toArray(), actual.toArray());
  }

  @Test
  public void test4_whenSolution() {
    List<Integer> actual = new Solution_658()
        .findClosestElements(new int[]{1, 2, 4, 4, 4, 4, 4, 5, 5, 5, 5}, 5, 5);
    assertArrayEquals(List.of(4, 5, 5, 5, 5).toArray(), actual.toArray());
  }

  @Test
  public void test1_whenSolution2() {
    List<Integer> actual = new Solution_658().findClosestElements2(new int[]{1, 2, 3, 4, 5}, 4, 3);
    assertArrayEquals(List.of(1, 2, 3, 4).toArray(), actual.toArray());
  }

  @Test
  public void test2_whenSolution2() {
    List<Integer> actual = new Solution_658().findClosestElements2(new int[]{1, 2, 3, 4, 5}, 4, -1);
    assertArrayEquals(List.of(1, 2, 3, 4).toArray(), actual.toArray());
  }

  @Test
  public void test3_whenSolution2() {
    List<Integer> actual = new Solution_658().findClosestElements2(
        new int[]{1, 2, 4, 4, 4, 4, 4, 5, 5, 5, 5}, 4, 5);
    assertArrayEquals(List.of(5, 5, 5, 5).toArray(), actual.toArray());
  }

  @Test
  public void test4_whenSolution2() {
    List<Integer> actual = new Solution_658().findClosestElements2(
        new int[]{1, 2, 4, 4, 4, 4, 4, 5, 5, 5, 5}, 5, 5);
    assertArrayEquals(List.of(4, 5, 5, 5, 5).toArray(), actual.toArray());
  }

  @Test
  public void test5_whenSolution2() {
    List<Integer> actual = new Solution_658().findClosestElements2(new int[]{1, 1, 1, 10, 10, 10},
        1, 9);
    assertArrayEquals(List.of(10).toArray(), actual.toArray());
  }

  @Test
  public void test6_whenSolution2() {
    List<Integer> actual = new Solution_658().findClosestElements2(new int[]{1, 3}, 1, 2);
    assertArrayEquals(List.of(1).toArray(), actual.toArray());
  }
}