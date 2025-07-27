package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_1268Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        List.of(
            List.of("mobile", "moneypot", "monitor"),
            List.of("mobile", "moneypot", "monitor"),
            List.of("mouse", "mousepad"),
            List.of("mouse", "mousepad"),
            List.of("mouse", "mousepad")
        ),
        new Solution_1268().suggestedProducts(
            new String[] {"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse"));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        List.of(
            List.of("havana"),
            List.of("havana"),
            List.of("havana"),
            List.of("havana"),
            List.of("havana"),
            List.of("havana")
        ),
        new Solution_1268().suggestedProducts(
            new String[] {"havana"}, "havana"));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(
        List.of(
            List.of(),
            List.of(),
            List.of(),
            List.of(),
            List.of(),
            List.of(),
            List.of()
        ),
        new Solution_1268().suggestedProducts(
            new String[] {"havana"}, "tatiana"));
  }
}