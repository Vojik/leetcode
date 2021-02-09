package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Solution_599Test {

  @Test
  public void test1_whenSolution1() {
    assertArrayEquals(new String[]{"Shogun"}, new Solution_599()
        .findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
            new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse",
                "Shogun"}));
  }

  @Test
  public void test2_whenSolution1() {
    assertArrayEquals(new String[]{"Shogun"}, new Solution_599()
        .findRestaurant(
            new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC", "Burger King", "KFC"},
            new String[]{"KFC", "Shogun", "Burger King"}));
  }

  @Test
  public void test3_whenSolution1() {
    assertArrayEquals(new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"},
        new Solution_599()
            .findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"}));
  }

  @Test
  public void test4_whenSolution1() {
    assertArrayEquals(new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"},
        new Solution_599()
            .findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KNN", "KFC", "Burger King", "Tapioca Express", "Shogun"}));
  }

  @Test
  public void test5_whenSolution1() {
    assertArrayEquals(new String[]{"KFC"}, new Solution_599()
        .findRestaurant(
            new String[]{"KFC"},
            new String[]{"KFC"}));
  }
}