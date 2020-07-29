package com.vojik.solutions;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution_819Test {

  @Test
  public void test1_whenSolution1() {
    String actual = Solution_819.solution1("a,b,b,b,b,b,b,c,c,c,!!!.", new String[] {"c"});
    Assertions.assertEquals("b", actual);
  }

  @Test
  public void test2_whenSolution1() {
    String actual = Solution_819.solution1("a,b,b,b,b,b,b,c,c,c,!!!.", new String[] {});
    Assertions.assertEquals("b", actual);
  }

  @Test
  public void test3_whenSolution1() {
    String actual = Solution_819
        .solution1("Bob hit a ball, the hit BALL flew far after it was hit.",
            new String[] {"hit"});
    Assertions.assertEquals("ball", actual);
  }

  @Test
  public void test4_whenSolution1() {
    String actual = Solution_819
        .solution1("Bob hit a ball, the hit BALL flew far after it was hit.",
            new String[] {});
    Assertions.assertEquals("hit", actual);
  }

  @Test
  public void test1_whenSolution2() {
    String actual = Solution_819.solution2("a,b,b,b,b,b,b,c,c,c,!!!.", new String[] {"c"});
    Assertions.assertEquals("b", actual);
  }

  @Test
  public void test2_whenSolution2() {
    String actual = Solution_819.solution2("a,b,b,b,b,b,b,c,c,c,!!!.", new String[] {});
    Assertions.assertEquals("b", actual);
  }

  @Test
  public void test3_whenSolution2() {
    String actual = Solution_819
        .solution2("Bob hit a ball, the hit BALL flew far after it was hit.",
            new String[] {"hit"});
    Assertions.assertEquals("ball", actual);
  }

  @Test
  public void test4_whenSolution2() {
    String actual = Solution_819
        .solution2("Bob hit a ball, the hit BALL flew far after it was hit.",
            new String[] {});
    Assertions.assertEquals("hit", actual);
  }

  @Test
  public void test5_whenSolution2() {
    String actual = Solution_819.solution2("a.", new String[] {});
    Assertions.assertEquals("a", actual);
  }

  @Test
  public void test6_whenSolution2() {
    String actual = Solution_819.solution2("Bob. hIt, baLl", new String[] {"bob", "hit"});
    Assertions.assertEquals("ball", actual);
  }
}