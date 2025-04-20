package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_2933Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(List.of("a"), new Solution_2933().findHighAccessEmployees(
        List.of(List.of("a", "0549"), List.of("b", "0457"), List.of("a", "0532"),
            List.of("a", "0621"), List.of("b", "0540"))));
  }

  @Test
  public void test2_whenSolution1() {
    assertEquals(List.of("c", "d"), new Solution_2933().findHighAccessEmployees(
        List.of(List.of("d", "0002"), List.of("c", "0808"), List.of("c", "0829"),
            List.of("e", "0215"), List.of("d", "1508"), List.of("d", "1444"), List.of("d", "1410"),
            List.of("c", "0809"))));
  }

  @Test
  public void test3_whenSolution1() {
    assertEquals(List.of("cd", "ab"), new Solution_2933().findHighAccessEmployees(
        List.of(List.of("cd", "1025"), List.of("ab", "1025"), List.of("cd", "1046"),
            List.of("cd", "1055"), List.of("ab", "1124"), List.of("ab", "1120"))));
  }

}