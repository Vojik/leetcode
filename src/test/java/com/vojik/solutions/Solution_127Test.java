package com.vojik.solutions;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution_127Test {

  @Test
  public void test1_whenSolution1() {
    Assertions.assertEquals(
        5,
        new Solution_127()
            .ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
  }

  @Test
  public void test2_whenSolution1() {
    Assertions.assertEquals(
        0,
        new Solution_127()
            .ladderLength("hit", "cog", List.of("hot","dot","dog","lot","log")));
  }
}
