package com.vojik.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Solution_212Test {

  @Test
  public void test1_whenSolution1() {
    assertEquals(
        List.of("oa", "oaa"),
        new Solution_212()
            .findWords(
                new char[][] {
                  {'o', 'a', 'b', 'n'},
                  {'o', 't', 'a', 'e'},
                  {'a', 'h', 'k', 'r'},
                  {'a', 'f', 'l', 'v'}
                },
                new String[] {"oa", "oaa"}));
  }
}
