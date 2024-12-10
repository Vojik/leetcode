package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_332Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(List.of("JFK", "NRT", "JFK", "KUL"), new Solution_332().findItinerary(
        List.of(List.of("JFK", "KUL"), List.of("JFK", "NRT"), List.of("NRT", "JFK"))));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"),
        new Solution_332().findItinerary(
            List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"), List.of("SFO", "SJC"),
                List.of("LHR", "SFO"))));
  }

  @Test
  public void test3_whenSolution1() {
    Assertions.assertEquals(List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"),
        new Solution_332().findItinerary(
            List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"), List.of("SFO", "ATL"),
                List.of("ATL", "JFK"), List.of("ATL", "SFO"))));
  }

}