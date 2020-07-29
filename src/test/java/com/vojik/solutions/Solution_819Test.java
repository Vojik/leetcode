package com.vojik.solutions;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_819Test {

  @Test
  public void shouldReturnB_whenSolution1() {
    String actual = Solution_819.solution1("a,b,b,b,b,b,b,c,c,c,!!!.", new String[] {"c"});
    Assertions.assertEquals(actual, "b");
  }

  @Test
  public void shouldReturnB_whenEmptyBannedList_whenSolution1() {
    String actual = Solution_819.solution1("a,b,b,b,b,b,b,c,c,c,!!!.", new String[] {});
    Assertions.assertEquals(actual, "b");
  }

  @Test
  public void shouldReturnBall_whenSolution1() {
    String actual = Solution_819
        .solution1("Bob hit a ball, the hit BALL flew far after it was hit.",
            new String[] {"hit"});
    Assertions.assertEquals(actual, "ball");
  }

  @Test
  public void shouldReturnHit_whenEmptyBannedList_whenSolution1() {
    String actual = Solution_819
        .solution1("Bob hit a ball, the hit BALL flew far after it was hit.",
            new String[] {});
    Assertions.assertEquals(actual, "hit");
  }

  @Test
  public void shouldReturnB_whenSolution2() {
    String actual = Solution_819.solution2("a,b,b,b,b,b,b,c,c,c,!!!.", new String[] {"c"});
    Assertions.assertEquals(actual, "b");
  }

  @Test
  public void shouldReturnB_whenEmptyBannedList_whenSolution2() {
    String actual = Solution_819.solution2("a,b,b,b,b,b,b,c,c,c,!!!.", new String[] {});
    Assertions.assertEquals(actual, "b");
  }

  @Test
  public void shouldReturnBall_whenSolution2() {
    String actual = Solution_819
        .solution2("Bob hit a ball, the hit BALL flew far after it was hit.",
            new String[] {"hit"});
    Assertions.assertEquals(actual, "ball");
  }

  @Test
  public void shouldReturnHit_whenEmptyBannedList_whenSolution2() {
    String actual = Solution_819
        .solution2("Bob hit a ball, the hit BALL flew far after it was hit.",
            new String[] {});
    Assertions.assertEquals(actual, "hit");
  }
}