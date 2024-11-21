package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_721Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        List.of(List.of("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"),
            List.of("Mary", "mary@mail.com"), List.of("John", "johnnybravo@mail.com")),
        new Solution_721().accountsMerge(
            List.of(List.of("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                List.of("John", "johnsmith@mail.com", "john00@mail.com"),
                List.of("Mary", "mary@mail.com"), List.of("John", "johnnybravo@mail.com"))));
  }

}